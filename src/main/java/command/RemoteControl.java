package command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl () {
        onCommands = new Command[7];
        offCommands = new Command[7];

        // 初始化时全部设为不干事的noCommand发
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
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
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n---------Remote Control -----------\n");
        for (int i = 0; i<onCommands.length; i++) {
            stringBuilder.append(
                    String.format("[slot %s] onCommand: %s, offCommand: %s\n",
                            i,
                            onCommands[i].getClass().getName(),
                            offCommands[i].getClass().getName()
                    )
            );
        }
        return stringBuilder.toString();
    }
}
