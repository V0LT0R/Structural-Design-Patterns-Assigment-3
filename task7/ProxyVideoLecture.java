public class ProxyVideoLecture implements VideoLecture {
    private String title;
    private String videoFile;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String title, String videoFile) {
        this.title = title;
        this.videoFile = videoFile;
    }

    @Override
    public String getInfo() {
        return title;
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title, videoFile);
        }
        realVideoLecture.play();
    }
}
