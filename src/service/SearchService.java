package service;

import java.util.List;

import model.Item;
import model.SearchCriteria;

public interface SearchService {

	public List<Item> searchItems(SearchCriteria searchCriteria);

}
