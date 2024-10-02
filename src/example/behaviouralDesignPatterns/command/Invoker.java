package example.behaviouralDesignPatterns.command;

import java.util.Stack;

public class Invoker
{
    private IcCommand icCommand;
    private Stack<IcCommand> commands = new Stack<>();
    public Invoker(IcCommand icCommand) {
        this.icCommand = icCommand;
    }

    public void pressButton() {
        commands.add(icCommand);
        icCommand.execute();
    }

    public void undo(){
        if(!commands.isEmpty()) {
            IcCommand lastCommand = commands.pop();
            lastCommand.undo();
        }
    }

    public void redo(){
        pressButton();
    }

}
