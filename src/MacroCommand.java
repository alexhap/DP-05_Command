/**
 * Created by alex on 23.06.2015.
 *
 */

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command com : commands)
            com.execute();
    }

    @Override
    public void undo() {
        for (Command com : commands)
            com.undo();
    }
}
