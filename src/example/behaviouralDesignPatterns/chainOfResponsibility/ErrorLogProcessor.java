package example.behaviouralDesignPatterns.chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor
{

    public ErrorLogProcessor(LogProcessor logProcessor)
    {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message)
    {
        if(logLevel == ERROR) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }

}
