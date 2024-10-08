package example.behaviouralDesignPatterns.observer;

public class MobileObserver implements Observer
{
    WsSubject subject;
    public MobileObserver(WsSubject subject) {
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("Data was displayed in mobile: "+ subject.getData());
    }
}
