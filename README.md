# 🛒 Flipkart Daily – Java LLD Design

A low-level design implementation of Flipkart’s upcoming grocery delivery feature. This simulation enables users to explore inventory via filters and sorting before placing an order.

---

## ✅ Features
- Add items with brand, category & price
- Update inventory quantities
- Search by:
  - Brand
  - Category
  - Price range
  - Combinations (e.g., category + price)
- Sort by:
  - Lowest price (default)
  - Highest price
  - Lowest quantity
- Easily extensible for more filters/sorting
- In-memory data structure (no DB)

---

## 🧱 Tech Stack
- Java (OOP-based)
- No external frameworks
- Clean separation: `Item`, `InventoryService`, `Main`

---

## 📌 Sample Flow
```java
AddItem(Amul, Milk, 100)
AddInventory(Amul, Milk, 10)
AddInventory(Amul, Milk, 10)
SearchItems(category = ["Milk"], orderBy = [Price, desc])
// Output: Amul, Milk, 20
