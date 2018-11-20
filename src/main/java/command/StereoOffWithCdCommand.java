package command;

public class StereoOffWithCdCommand implements Command {
    private Stereo stereo;

    public StereoOffWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
