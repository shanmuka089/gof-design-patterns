package example.behaviouralDesignPatterns.templateMethod;

public class PaymentToMerchant extends Payment
{

    @Override
    void validateRequest()
    {
        System.out.println("payment to merchant request has been validated");
    }

    @Override
    void calculateFeeS()
    {
        System.out.println("for payment to merchant calculate the fees with 2% commission");
    }

    @Override
    void debitMoney()
    {
        System.out.println("amount is debited from sender bank");
    }

    @Override
    void creditMoney()
    {
        System.out.println("amount is credited to receiver bank");
    }

}
