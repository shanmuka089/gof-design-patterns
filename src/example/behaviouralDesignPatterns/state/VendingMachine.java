package example.behaviouralDesignPatterns.state;

import example.behaviouralDesignPatterns.state.pattern.CurrentState;
import example.behaviouralDesignPatterns.state.pattern.HaveMoney;
import example.behaviouralDesignPatterns.state.pattern.StateChange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class VendingMachine
{
    private StateChange currentState;
    private List<ItemShelf> shelfs;
    private List<Coin> coins;
    private final int maxShelves;
    private final int shelfCapacity;

    private Coin insertedCoin;
    private Item selectedProduct;

    public StateChange getState() {
        return this.currentState;
    }
    public VendingMachine(int maxShelves, int shelfCapacity) {
        this.shelfs = new ArrayList<>();
        this.coins = new ArrayList<>();
        this.maxShelves = maxShelves;
        this.shelfCapacity = shelfCapacity;
        this.currentState = new CurrentState(this);
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public void setCurrentState(StateChange stateChange) {
        this.currentState = stateChange;
    }

    public void addItem(Item item) {
        // Find the first shelf that is not full and add the item
        Optional<ItemShelf> shelf = shelfs.stream()
                .filter(s -> !s.isShelfFull())
                .findFirst();

        if (shelf.isPresent()) {
            shelf.get().add(item);
        } else {
            // If all shelves are full, check if we can add a new shelf
            if (shelfs.size() < maxShelves) {
                ItemShelf newShelf = new ItemShelf(shelfCapacity);
                newShelf.add(item);
                shelfs.add(newShelf);
            } else {
                throw new RuntimeException("All shelves are full!");
            }
        }
    }

    public void insertCoin(Coin coin) {
        this.setInsertedCoin(coin);
        this.coins.add(coin);
    }

    public Item selectProduct(ItemType itemType) {
        for (ItemShelf itemShelf : shelfs) {
            Optional<Item> optionalItem = findAndRemoveItemInShelf(itemShelf, itemType);
            if (optionalItem.isPresent()) {
                return optionalItem.get();
            }
        }
        return null;
    }

    public Optional<Item> findAndRemoveItemInShelf(ItemShelf itemShelf, ItemType itemType) {
        for (Iterator<Item> iterator = itemShelf.getItems().iterator(); iterator.hasNext(); ) {
            Item item = iterator.next();
            if (item.getItemType() == itemType) {
                iterator.remove();
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Coin getInsertedCoin()
    {
        return insertedCoin;
    }

    public void setInsertedCoin(Coin insertedCoin)
    {

        this.insertedCoin = insertedCoin;
    }

    public Item getSelectedProduct()
    {

        return selectedProduct;
    }

    public void setSelectedProduct(Item selectedProduct)
    {

        this.selectedProduct = selectedProduct;
    }

}
