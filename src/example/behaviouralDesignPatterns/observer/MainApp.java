package example.behaviouralDesignPatterns.observer;

public class MainApp
{

    public static void main(String[] args)
    {
        WsSubject subject = new WeatherStatisticsSubjectConcrete();

        Observer observer1 = new MobileObserver(subject);
        Observer observer2 = new TvScreenObserver(subject);

        subject.add(observer1);
        subject.add(observer2);

        subject.setData(50);
    }
}
