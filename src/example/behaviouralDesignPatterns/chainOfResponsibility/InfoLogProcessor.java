package example.behaviouralDesignPatterns.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor
{

    public InfoLogProcessor(LogProcessor logProcessor)
    {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message)
    {
        if(logLevel == INFO) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }

}
