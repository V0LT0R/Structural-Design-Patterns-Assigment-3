public class RealVideoLecture implements VideoLecture {
    private String title;
    private String videoFile;

    public RealVideoLecture(String title, String videoFile) {
        this.title = title;
        this.videoFile = videoFile;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video: " + videoFile + "...");
        // Simulating time-consuming video loading
        try {
            Thread.sleep(2000); // 2 seconds delay to simulate loading
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Video loaded: " + videoFile);
    }

    @Override
    public String getInfo() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
