package service.serviceImpl;

import java.util.Map;

import model.Inventory;
import model.Item;
import service.InventoryService;

public class InventoryServiceImpl implements InventoryService {

	@Override
	public void addInventory(String brand, String category, Integer quantity) {
		Map<Item, Integer> inventorySnapshot = Inventory.getInventory().getInventorySnapshot();
		Item item = new Item(brand, category, 0);
		if (inventorySnapshot.containsKey(item)) {
			inventorySnapshot.put(item, inventorySnapshot.get(item) + quantity);
		}
	}

}
