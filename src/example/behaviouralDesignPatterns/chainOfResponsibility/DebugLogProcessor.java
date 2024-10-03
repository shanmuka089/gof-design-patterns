package example.behaviouralDesignPatterns.chainOfResponsibility;

public class DebugLogProcessor extends LogProcessor
{

    public DebugLogProcessor(LogProcessor logProcessor)
    {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message)
    {
        if(logLevel == DEBUG) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }

}
