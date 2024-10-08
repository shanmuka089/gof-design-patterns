package example.behaviouralDesignPatterns.observer;

public class TvScreenObserver implements Observer
{
    WsSubject subject;
    public TvScreenObserver(WsSubject subject) {
        this.subject = subject;
    }
    @Override
    public void update()
    {
        System.out.println("Data was displayed in TV: "+ subject.getData());
    }
}
