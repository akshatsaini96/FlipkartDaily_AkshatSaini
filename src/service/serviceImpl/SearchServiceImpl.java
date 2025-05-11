package service.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import filters.BrandFilterImpl;
import filters.CategoryFilterImpl;
import filters.Filters;
import filters.MaxPriceFilterImpl;
import filters.MinPriceFilterImpl;
import model.Inventory;
import model.Item;
import model.SearchCriteria;
import service.SearchService;

public class SearchServiceImpl implements SearchService {

	@Override
	public List<Item> searchItems(SearchCriteria searchCriteria) {

		Map<Item, Integer> inventorySnapshot = Inventory.getInventory().getInventorySnapshot();

		List<Item> items = new ArrayList<Item>();
		List<Filters> filters = Arrays.asList(new BrandFilterImpl(), new CategoryFilterImpl(), new MinPriceFilterImpl(),
				new MaxPriceFilterImpl());
		for (Map.Entry<Item, Integer> entry : inventorySnapshot.entrySet()) {
			Item item = entry.getKey();
			boolean isPassed = true;
			for (Filters filter : filters) {
				if (!filter.filter(item, searchCriteria)) {
					isPassed = false;
					break;
				}
			}
			if (isPassed)
				items.add(item);

		}
		sort(items, searchCriteria);
		return items;
	}

	public void sort(List<Item> items, SearchCriteria searchCriteria) {
		List<String> orderBy = searchCriteria.getOrderBy();
		Map<Item, Integer> inventorySnapshot = Inventory.getInventory().getInventorySnapshot();
		if (orderBy != null && orderBy.size() != 0)

		{
			String param = orderBy.get(0);
			String direction = orderBy.get(1);
			if (param.equals("price") && direction.equals("asc"))
				Collections.sort(items, (i1, i2) -> Integer.compare(i1.getPrice(), i2.getPrice()));
			else if (param.equals("price") && direction.equals("desc"))
				Collections.sort(items, (i1, i2) -> Integer.compare(i2.getPrice(), i1.getPrice()));
			else if (param.equals("quantity") && direction.equals("asc"))
				Collections.sort(items,
						(i1, i2) -> Integer.compare(inventorySnapshot.get(i1), inventorySnapshot.get(i2)));
			else if (param.equals("quantity") && direction.equals("desc"))
				Collections.sort(items,
						(i1, i2) -> Integer.compare(inventorySnapshot.get(i2), inventorySnapshot.get(i1)));
		}

	}

}
