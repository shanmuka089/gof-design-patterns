package example.behaviouralDesignPatterns.mediator;

public interface BidderColleague
{
    void setMediator(AuctionMediator mediator);
    void callBid(int bidAmount);
    String getName();
    void receiveNotifications(int bidAmount, String bidderName);
}
