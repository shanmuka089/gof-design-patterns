package example.behaviouralDesignPatterns.state.pattern;

import example.behaviouralDesignPatterns.state.Coin;
import example.behaviouralDesignPatterns.state.Item;
import example.behaviouralDesignPatterns.state.ItemType;
import example.behaviouralDesignPatterns.state.VendingMachine;

public abstract class StateChange
{
    VendingMachine vendingMachine;

    public StateChange(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void pressInsertButton();
    public abstract void insertCoin(Coin coin);
    public abstract void pressProductSelectMenu();
    public Coin cancelRequest() {
        System.out.println("Cancelling the request...");
        Coin coin = vendingMachine.getInsertedCoin();
        vendingMachine.setInsertedCoin(null);
        return coin;
    }
    public abstract void selectProduct(ItemType itemType);
    public abstract void returnChange(int returnChange);
    public abstract Item dispenseProduct();
}
