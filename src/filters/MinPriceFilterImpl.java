package filters;

import model.Item;
import model.SearchCriteria;

public class MinPriceFilterImpl implements Filters {

	@Override
	public boolean filter(Item item, SearchCriteria searchCriteria) {
		Integer minPrice = searchCriteria.getMinPrice();
		if (minPrice == null || item.getPrice() > minPrice)
			return true;
		else
			return false;
	}

}
