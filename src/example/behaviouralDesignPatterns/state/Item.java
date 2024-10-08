package example.behaviouralDesignPatterns.state;

public class Item
{
    int code;
    int price;
    ItemType itemType;

    public Item(int code, int price, ItemType itemType)
    {
        this.code = code;
        this.price = price;
        this.itemType = itemType;
    }

    public Item() {}

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    public void setItemType(ItemType itemType)
    {
        this.itemType = itemType;
    }
}
