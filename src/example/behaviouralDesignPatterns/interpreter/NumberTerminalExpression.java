package example.behaviouralDesignPatterns.interpreter;

public class NumberTerminalExpression implements AbstractExpression
{
    String name;
    public NumberTerminalExpression(String name) {
        this.name = name;
    }
    @Override
    public int interpret(Context context)
    {
        return context.get(name);
    }
}
