package example.behaviouralDesignPatterns.state.pattern;

import example.behaviouralDesignPatterns.state.Coin;
import example.behaviouralDesignPatterns.state.Item;
import example.behaviouralDesignPatterns.state.ItemType;
import example.behaviouralDesignPatterns.state.VendingMachine;

public class CurrentState extends StateChange
{
    public CurrentState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void pressInsertButton()
    {
        System.out.println("Insert button clicked!...");
        vendingMachine.setCurrentState(new HaveMoney(vendingMachine));
    }

    @Override
    public void insertCoin(Coin coin)
    {

    }

    @Override
    public void pressProductSelectMenu()
    {

    }

    @Override
    public void selectProduct(ItemType itemType)
    {}

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
