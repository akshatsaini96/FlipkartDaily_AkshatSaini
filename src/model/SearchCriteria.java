package model;

import java.util.List;

public class SearchCriteria {
	// list of categories
	private List<String> category;
	// list of brands
	private List<String> brand;
	private Integer minPrice;
	private Integer maxPrice;
	private List<String> orderBy;

	public SearchCriteria() {
		super();
	}

	public SearchCriteria(List<String> category, List<String> brand, Integer minPrice, Integer maxPrice,
			List<String> orderBy) {
		super();
		this.category = category;
		this.brand = brand;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.orderBy = orderBy;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public List<String> getBrand() {
		return brand;
	}

	public void setBrand(List<String> brand) {
		this.brand = brand;
	}

	public Integer getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}

	public Integer getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}

	public List<String> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<String> orderBy) {
		this.orderBy = orderBy;
	}

}
