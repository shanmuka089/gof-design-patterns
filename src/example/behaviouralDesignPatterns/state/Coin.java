package example.behaviouralDesignPatterns.state;

public enum Coin
{
    RUPEE(20),
    QUARTER(15),
    DYNE(10);
    int value;
    Coin(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
