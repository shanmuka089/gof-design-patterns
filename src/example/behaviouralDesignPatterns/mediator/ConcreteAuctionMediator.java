package example.behaviouralDesignPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAuctionMediator implements AuctionMediator
{
    List<BidderColleague> colleagues = new ArrayList<>();
    @Override
    public void placeBid(BidderColleague bidderColleague, int bidAmount)
    {
        for(BidderColleague colleague : colleagues) {
            if(!colleague.getName().equals(bidderColleague.getName())) {
                colleague.receiveNotifications(bidAmount, bidderColleague.getName());
            }
        }
    }
    @Override
    public void registerColleague(BidderColleague colleague)
    {
        colleagues.add(colleague);
    }
}
