package command;

public class RemoteLoader {

    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("客厅");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo("客房");
        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffWithCdCommand stereoOffWithCdCommand = new StereoOffWithCdCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCdCommand, stereoOffWithCdCommand);

        for (int i = 0; i < 7; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
    }
}
