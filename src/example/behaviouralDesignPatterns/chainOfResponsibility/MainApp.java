package example.behaviouralDesignPatterns.chainOfResponsibility;

public class MainApp
{

    public static void main(String[] args)
    {
        LogProcessor processor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        processor.log(1, "Info log Message");
        processor.log(2, "Debug Log Message");
        processor.log(3, "Error log message");
        processor.log(4, null);
    }
}
