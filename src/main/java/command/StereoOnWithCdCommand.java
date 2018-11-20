package command;

public class StereoOnWithCdCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd("张学友劲歌金曲");
        stereo.setVolume(11);
    }
}
