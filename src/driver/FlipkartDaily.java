package driver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import model.Inventory;
import model.Item;
import model.SearchCriteria;
import service.InventoryService;
import service.ItemService;
import service.SearchService;
import service.serviceImpl.InventoryServiceImpl;
import service.serviceImpl.ItemServiceImpl;
import service.serviceImpl.SearchServiceImpl;

public class FlipkartDaily {
	public static void main(String[] args) {
		ItemService itemService = new ItemServiceImpl();
		InventoryService inventoryService = new InventoryServiceImpl();
		// Add Items
		itemService.addItem("Amul", "Milk", 100);
		itemService.addItem("Amul", "Curd", 50);
		itemService.addItem("Nestle", "Milk", 60);
		itemService.addItem("Nestle", "Curd", 90);

		// Add Inventory
		inventoryService.addInventory("Amul", "Milk", 10);
		inventoryService.addInventory("Nestle", "Milk", 5);
		inventoryService.addInventory("Nestle", "Curd", 10);
		inventoryService.addInventory("Amul", "Milk", 10);
		inventoryService.addInventory("Amul", "Curd", 5);

		// Searching Criteria
		SearchCriteria searchCriteria = new SearchCriteria(Arrays.asList("Milk"), null, null, null, null);
		SearchService searchService = new SearchServiceImpl();
		List<Item> items = searchService.searchItems(searchCriteria);

		items.forEach((item) -> System.out.println("items are" + item));

		// print the values
		Map<Item, Integer> hashMap = Inventory.getInventory().getInventorySnapshot();
		hashMap.forEach((key, value) -> {
			System.out.print("item is -" + key + " quantity is -" + value);
		});

	}
}
