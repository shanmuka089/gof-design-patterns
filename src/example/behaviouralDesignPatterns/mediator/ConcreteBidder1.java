package example.behaviouralDesignPatterns.mediator;

public class ConcreteBidder1 implements BidderColleague
{
    String name;
    AuctionMediator mediator;
    public ConcreteBidder1(String name, AuctionMediator mediator) {
        this.name = name;
        this.setMediator(mediator);
        this.mediator.registerColleague(this);
    }
    @Override
    public void setMediator(AuctionMediator mediator)
    {
        this.mediator = mediator;
    }
    @Override
    public void callBid(int bidAmount)
    {
        mediator.placeBid(this, bidAmount);
    }
    @Override
    public String getName() {

        return this.name;
    }
    @Override
    public void receiveNotifications(int bidAmount, String bidderName) {
        System.out.println("Hey! "+ this.name + ", "+bidderName+" placed an bid of amount: "+ bidAmount);
    }

}
