package example.behaviouralDesignPatterns.mediator;

public class MainApp
{

    public static void main(String[] args)
    {
        AuctionMediator mediator = new ConcreteAuctionMediator();

        BidderColleague bidderColleague1 = new ConcreteBidder1("Shanu", mediator);

        BidderColleague bidderColleague2 = new ConcreteBidder1("Vedha", mediator);

        BidderColleague bidderColleague3 = new ConcreteBidder1("Veena", mediator);

        BidderColleague bidderColleague4 = new ConcreteBidder1("Priyanka", mediator);

        bidderColleague1.callBid(400000);

    }
}
