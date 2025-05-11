package filters;

import model.Item;
import model.SearchCriteria;

public class MaxPriceFilterImpl implements Filters {
	@Override
	public boolean filter(Item item, SearchCriteria searchCriteria) {
		Integer maxPrice = searchCriteria.getMaxPrice();
		if (maxPrice == null || item.getPrice() < maxPrice)
			return true;
		else
			return false;
	}

}
