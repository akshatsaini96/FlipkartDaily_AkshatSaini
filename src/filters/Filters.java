package filters;

import model.Item;
import model.SearchCriteria;

public interface Filters {
	public boolean filter(Item item, SearchCriteria searchCriteria);

}
