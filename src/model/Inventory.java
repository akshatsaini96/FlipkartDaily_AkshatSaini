package model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	private final Map<Item, Integer> inventorySnapshot = new HashMap<Item, Integer>();
	private static final Inventory inventory = new Inventory();

	private Inventory() {

	}

	public static Inventory getInventory() {
		return inventory;
	}

	public Map<Item, Integer> getInventorySnapshot() {
		return inventorySnapshot;
	}

}
