/**
 * Created by alex on 23.06.2015.
 *
 */

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    public String toString() {
        String res;
        res = "\n---------- Remote Control ----------\n";
        for (int i = 0; i < 7; i++) {
            res = res.concat("[slot" + i + "] " + onCommands[i].getClass().getName() + "\t " + offCommands[i].getClass().getName() + "\n");
        }
        res = res.concat("undo command: " + undoCommand.getClass().getName() + "\n");
        return res;
    }
}
