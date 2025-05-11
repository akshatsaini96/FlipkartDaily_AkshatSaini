package model;

import java.util.Objects;

public class Item {
//	[category → milk, bread ]
	private String category;
//	[brand → Amul milk or Britannia bread]
	private String brand;
	private Integer price;
//[unique identifier for the item]
	private String itemId;

	public Item(String brand, String category, Integer price) {

		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, category);
	}

// acts a unique identifier(not taking price in my application as of now)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(category, other.category);
	}

	@Override
	public String toString() {
		return "Item [category=" + category + ", brand=" + brand + ", price=" + price + "]";
	}

}
