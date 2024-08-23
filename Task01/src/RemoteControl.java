public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(int slots){
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        undoCommand = null;
    }

    public void setCommand(int slots, Command onCommand, Command offCommand){
        onCommands[slots] = onCommand;
        offCommands[slots] = offCommand;
    }

    public void onButtonWasPushed(int slots){

        onCommands[slots].execute();
        undoCommand = onCommands[slots];
    }

    public void offButtonWasPushed(int slots){
        offCommands[slots].execute();
        undoCommand = offCommands[slots];
    }

    public void undoButtonWasPushed(){
        if (undoCommand!=null){
            undoCommand.undo();
        }
    }
}
