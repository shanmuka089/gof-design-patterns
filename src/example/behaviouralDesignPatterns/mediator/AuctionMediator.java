package example.behaviouralDesignPatterns.mediator;

public interface AuctionMediator
{
    void placeBid(BidderColleague bidderColleague, int bidAmount);

    void registerColleague(BidderColleague colleague);
}
