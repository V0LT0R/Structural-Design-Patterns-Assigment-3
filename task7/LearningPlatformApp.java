public class LearningPlatformApp {
    public static void main(String[] args) {
        // Create an online course
        OnlineCourse course = new OnlineCourse("Design Patterns");

        // Add video lectures to the course using the proxy
        course.addLecture(new ProxyVideoLecture("Introduction to Design Patterns", "intro.mp4"));
        course.addLecture(new ProxyVideoLecture("Flyweight Pattern", "flyweight.mp4"));
        course.addLecture(new ProxyVideoLecture("Proxy Pattern", "proxy.mp4"));

        // Show course content (lectures)
        course.showCourseContent();

        // Play specific lectures
        System.out.println("\nStudent selects to play Lecture 2 (Flyweight Pattern):");
        course.playLecture(2);

        System.out.println("\nStudent selects to play Lecture 1 (Introduction to Design Patterns):");
        course.playLecture(1);

        System.out.println("\nStudent selects to play Lecture 3 (Proxy Pattern):");
        course.playLecture(3);
    }
}
