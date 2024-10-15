public class DVDDevice implements Device {
    private boolean on;
    private int volume;
    private int channel; // Let's assume the channel is for DVD menus.

    @Override
    public void powerOn() {
        on = true;
        System.out.println("DVD Player is powered ON");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("DVD Player is powered OFF");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("DVD menu channel set to: " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD Player volume set to: " + volume);
    }
}
