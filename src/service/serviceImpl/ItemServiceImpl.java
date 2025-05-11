package service.serviceImpl;

import java.util.Map;

import model.Inventory;
import model.Item;
import service.ItemService;

public class ItemServiceImpl implements ItemService {

	@Override
	public void addItem(String brand, String category, Integer price) {
		Item item = new Item(brand, category, price);
		Map<Item, Integer> inventorySnapshot = Inventory.getInventory().getInventorySnapshot();
		inventorySnapshot.put(item, 0);

	}

}
