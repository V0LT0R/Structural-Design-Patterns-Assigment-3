public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemoteForTV = new BasicRemote(tv);
        basicRemoteForTV.powerOn();
        basicRemoteForTV.setChannel(5);
        basicRemoteForTV.setVolume(10);
        basicRemoteForTV.powerOff();

        Device dvd = new DVDDevice();
        AdvancedRemote advancedRemoteForDVD = new AdvancedRemote(dvd);
        advancedRemoteForDVD.powerOn();
        advancedRemoteForDVD.setChannel(1);
        advancedRemoteForDVD.setVolume(20);
        advancedRemoteForDVD.mute();
        advancedRemoteForDVD.powerOff();

        Device soundSystem = new SoundSystemDevice();
        RemoteControl basicRemoteForSoundSystem = new BasicRemote(soundSystem);
        basicRemoteForSoundSystem.powerOn();
        basicRemoteForSoundSystem.setVolume(50);
        basicRemoteForSoundSystem.powerOff();
    }
}
