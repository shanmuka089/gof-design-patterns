package example.behaviouralDesignPatterns.templateMethod;

public class PaymentToFriend extends Payment
{

    @Override
    void validateRequest()
    {
        System.out.println("Payment request to friend has been validated");
    }

    @Override
    void calculateFeeS()
    {
        System.out.println("send money to friend with 0% commission");
    }

    @Override
    void debitMoney()
    {
        System.out.println("debit the money from sender bank");
    }

    @Override
    void creditMoney()
    {
        System.out.println("credit the money to receiver bank");
    }

}
