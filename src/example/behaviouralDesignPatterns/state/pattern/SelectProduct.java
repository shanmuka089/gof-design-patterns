package example.behaviouralDesignPatterns.state.pattern;

import example.behaviouralDesignPatterns.state.Coin;
import example.behaviouralDesignPatterns.state.Item;
import example.behaviouralDesignPatterns.state.ItemType;
import example.behaviouralDesignPatterns.state.VendingMachine;

public class SelectProduct extends StateChange
{

    public SelectProduct(VendingMachine vendingMachine)
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
        System.out.println("Selected the item: "+ itemType.name());
       Item item = vendingMachine.selectProduct(itemType);
       int productPrice = item.getPrice();
       int price = vendingMachine.getInsertedCoin().getValue();
       if(productPrice > price) {
           vendingMachine.addItem(item);
           System.err.println("Insufficient fund");
           cancelRequest();
       } else {
           vendingMachine.setSelectedProduct(item);
           returnChange(price - productPrice);
       }
       vendingMachine.setCurrentState(new DispenseState(vendingMachine));
    }

    @Override
    public void returnChange(int returnChange)
    {
        if(returnChange != 0)
        {
            System.out.println("change returned of amount: "+ returnChange);
        }
    }

    @Override
    public Item dispenseProduct()
    {

        return null;
    }

}
