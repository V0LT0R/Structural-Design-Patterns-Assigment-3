public class TVDevice implements Device {
    private boolean on;
    private int volume;
    private int channel;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("TV is powered ON");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("TV is powered OFF");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel set to: " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to: " + volume);
    }
}
