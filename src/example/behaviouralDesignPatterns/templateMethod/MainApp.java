package example.behaviouralDesignPatterns.templateMethod;

public class MainApp
{

    public static void main(String[] args)
    {
        Payment payment = new PaymentToMerchant();
        payment.sendMoney();
    }
}
