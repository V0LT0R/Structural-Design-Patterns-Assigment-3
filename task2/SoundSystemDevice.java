public class SoundSystemDevice implements Device {
    private boolean on;
    private int volume;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("Sound System is powered ON");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("Sound System is powered OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System doesn't support channel switching.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound System volume set to: " + volume);
    }
}
