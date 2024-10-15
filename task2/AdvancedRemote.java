public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }
}
