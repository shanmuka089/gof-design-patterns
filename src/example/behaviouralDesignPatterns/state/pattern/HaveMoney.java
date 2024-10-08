package example.behaviouralDesignPatterns.state.pattern;

import example.behaviouralDesignPatterns.state.Coin;
import example.behaviouralDesignPatterns.state.Item;
import example.behaviouralDesignPatterns.state.ItemType;
import example.behaviouralDesignPatterns.state.VendingMachine;

public class HaveMoney extends StateChange
{
    public HaveMoney(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void pressInsertButton()
    {

    }

    @Override
    public void insertCoin(Coin coin)
    {
        vendingMachine.insertCoin(coin);
        System.out.println("Coin inserted successfully!...");
    }

    @Override
    public void pressProductSelectMenu()
    {
        System.out.println("pressed product select menu");
        vendingMachine.setCurrentState(new SelectProduct(vendingMachine));
    }

    @Override
    public void selectProduct(ItemType itemType)
    {

    }

    @Override
    public void returnChange(int returnChange)
    {

    }

    @Override
    public Item dispenseProduct()
    {

        return null;
    }

}
