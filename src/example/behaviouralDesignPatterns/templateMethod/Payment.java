package example.behaviouralDesignPatterns.templateMethod;

public abstract class Payment
{
    abstract void validateRequest();
    abstract void calculateFeeS();
    abstract void debitMoney();
    abstract void creditMoney();

    public final void sendMoney() {
        validateRequest();
        calculateFeeS();
        debitMoney();
        creditMoney();
    }
}
