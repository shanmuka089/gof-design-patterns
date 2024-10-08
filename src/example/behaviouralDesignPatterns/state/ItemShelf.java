package example.behaviouralDesignPatterns.state;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf
{
    private List<Item> items;
    private final int capacity;

    public ItemShelf(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Item item) {
        if (isShelfFull()) {
            throw new RuntimeException("Shelf is full. Cannot add more items.");
        }
        items.add(item);
    }

    public boolean isShelfFull() {
        return items.size() >= capacity;
    }

    public List<Item> getItems() {
        return this.items;
    }
}
