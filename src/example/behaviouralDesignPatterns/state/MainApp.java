package example.behaviouralDesignPatterns.state;

import example.behaviouralDesignPatterns.state.pattern.StateChange;

public class MainApp
{

    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine(3, 3);
        loadVendingMachine(vendingMachine);
//      idle state
        StateChange idleState = vendingMachine.getState();
        idleState.pressInsertButton();
//       Have money state
        StateChange haveMoneyState = vendingMachine.getState();
        haveMoneyState.insertCoin(Coin.RUPEE);
        haveMoneyState.pressProductSelectMenu();

        StateChange selectionState = vendingMachine.getState();
        selectionState.selectProduct(ItemType.LIME);

        StateChange dispenceState = vendingMachine.getState();
        dispenceState.dispenseProduct();

    }

    public static void loadVendingMachine(VendingMachine vendingMachine) {
        Item item = new Item();
        item.setItemType(ItemType.COKE);
        item.setCode(101);
        item.setPrice(15);

        Item item2 = new Item();
        item2.setItemType(ItemType.COKE);
        item2.setCode(102);
        item2.setPrice(15);

        Item item3 = new Item();
        item3.setItemType(ItemType.PEPSI);
        item3.setCode(103);
        item3.setPrice(20);

        Item item4 = new Item();
        item4.setItemType(ItemType.LIME);
        item4.setCode(104);
        item4.setPrice(10);

        Item item5 = new Item();
        item5.setItemType(ItemType.COKE);
        item5.setCode(105);
        item5.setPrice(15);

        Item item6 = new Item();
        item6.setItemType(ItemType.COKE);
        item6.setCode(106);
        item6.setPrice(15);

        Item item7 = new Item();
        item7.setItemType(ItemType.LIME);
        item7.setCode(107);
        item7.setPrice(10);

        Item item8 = new Item();
        item8.setItemType(ItemType.PEPSI);
        item8.setCode(108);
        item8.setPrice(20);

        Item item9 = new Item();
        item9.setItemType(ItemType.LIME);
        item9.setCode(109);
        item9.setPrice(10);

        Item item10 = new Item();
        item10.setItemType(ItemType.LIME);
        item10.setCode(110);
        item10.setPrice(10);

        vendingMachine.addItem(item);
        vendingMachine.addItem(item2);
        vendingMachine.addItem(item3);
        vendingMachine.addItem(item4);
        vendingMachine.addItem(item5);
        vendingMachine.addItem(item6);
        vendingMachine.addItem(item7);
        vendingMachine.addItem(item8);
        vendingMachine.addItem(item9);

    }
}
