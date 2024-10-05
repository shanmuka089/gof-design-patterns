package example.behaviouralDesignPatterns.interpreter;

public class MainApp
{
    public static void main(String[] args)
    {
        Context context = new Context();
        context.put("a", 6);
        context.put("b", 3);
        context.put("c", 9);
        context.put("d", 7);
        AbstractExpression abstractExpression = new SumNonTerminalExpression(
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));

        System.out.println(abstractExpression.interpret(context));
    }
}
