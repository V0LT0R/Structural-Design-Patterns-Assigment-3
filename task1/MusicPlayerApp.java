public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "song.mp3");

        AudioPlayer wavAdapter = new AudioAdapter("wav");
        wavAdapter.play("wav", "song.wav");

        AudioPlayer aacAdapter = new AudioAdapter("aac");
        aacAdapter.play("aac", "song.aac");
    }
}
