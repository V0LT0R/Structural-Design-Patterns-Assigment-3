import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private String courseName;
    private List<VideoLecture> lectures = new ArrayList<>();

    public OnlineCourse(String courseName) {
        this.courseName = courseName;
    }

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void showCourseContent() {
        System.out.println("Course: " + courseName);
        for (int i = 0; i < lectures.size(); i++) {
            System.out.println("Lecture " + (i + 1) + ": " + lectures.get(i).getInfo());
        }
    }

    public void playLecture(int lectureNumber) {
        if (lectureNumber <= lectures.size()) {
            VideoLecture lecture = lectures.get(lectureNumber - 1);
            lecture.play();
        } else {
            System.out.println("Lecture not found!");
        }
    }
}
