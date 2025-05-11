package filters;

import java.util.List;

import model.Item;
import model.SearchCriteria;

public class CategoryFilterImpl implements Filters {

	@Override
	public boolean filter(Item item, SearchCriteria searchCriteria) {
		List<String> categories = searchCriteria.getCategory();
		if (categories == null || categories.contains(item.getCategory()))
			return true;
		else
			return false;
	}

}
