package example.behaviouralDesignPatterns.state.pattern;

import example.behaviouralDesignPatterns.state.Coin;
import example.behaviouralDesignPatterns.state.Item;
import example.behaviouralDesignPatterns.state.ItemType;
import example.behaviouralDesignPatterns.state.VendingMachine;

public class DispenseState extends StateChange
{

    public DispenseState(VendingMachine vendingMachine)
    {
        super(vendingMachine);
    }

    @Override
    public void pressInsertButton()
    {

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
    {

    }

    @Override
    public void returnChange(int returnChange)
    {

    }

    @Override
    public Item dispenseProduct()
    {
        if(vendingMachine.getInsertedCoin() == null) return null;

            System.out.println("Dispensed the product: " + vendingMachine.getSelectedProduct().getItemType().name());

            vendingMachine.setCurrentState(new CurrentState(vendingMachine));
            return vendingMachine.getSelectedProduct();

    }

}
