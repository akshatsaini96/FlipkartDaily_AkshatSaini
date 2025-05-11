package filters;

import java.util.List;

import model.Item;
import model.SearchCriteria;

public class BrandFilterImpl implements Filters {

	@Override
	public boolean filter(Item item, SearchCriteria searchCriteria) {
		List<String> brands = searchCriteria.getBrand();
		if (brands == null || brands.contains(item.getBrand()))
			return true;
		return false;
	}

}
