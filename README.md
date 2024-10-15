# Online Learning Platform - Proxy Pattern

## Overview
This project demonstrates the use of the **Proxy Pattern** to implement lazy loading in an online learning platform. The goal is to defer the loading of video lectures until the student actually plays them, which optimizes performance and memory usage. The platform simulates adding video lectures to a course and allows students to browse and play them as needed.

## Project Structure
The project consists of the following classes:

1. **`VideoLecture` Interface**
   - Defines the structure for video lectures with two methods:
     - `getInfo()`: Returns the title or information of the lecture.
     - `play()`: Simulates playing the video lecture.

2. **`RealVideoLecture` Class**
   - Implements `VideoLecture` and represents the actual video lecture.
   - It simulates the time-consuming process of loading a video and then playing it.
   - Methods:
     - `getInfo()`: Returns the title of the video lecture.
     - `play()`: Plays the video lecture after it is loaded.

3. **`ProxyVideoLecture` Class**
   - Implements `VideoLecture` and acts as a virtual proxy for `RealVideoLecture`.
   - The proxy holds off loading the actual video lecture until `play()` is called.
   - It stores the lecture title and video file, and only creates a `RealVideoLecture` object when the user plays the lecture for the first time.
   - Methods:
     - `getInfo()`: Returns the title of the lecture.
     - `play()`: Lazily loads the video and plays it.

4. **`OnlineCourse` Class**
   - Represents an online course containing multiple video lectures.
   - Lectures can be added to the course using `ProxyVideoLecture`, and students can browse the course content without loading the videos.
   - Methods:
     - `addLecture()`: Adds a `VideoLecture` to the course.
     - `showCourseContent()`: Displays the titles of all lectures in the course.
     - `playLecture()`: Plays a specific lecture based on its index in the list.

5. **`LearningPlatformApp` Class**
   - This is the main class that simulates a student browsing an online course and playing lectures.
   - Demonstrates how the proxy works by adding lectures to a course and showing that video lectures are only loaded when played.

## How to Run
1. Compile all the Java files in the project.
2. Run the `LearningPlatformApp` class to see the proxy in action.

   The output will demonstrate:
   - The course content is shown without loading the video files.
   - Video lectures are loaded only when the `play()` method is called for the first time.

## Example Output
```bash
Course: Design Patterns
Lecture 1: Introduction to Design Patterns
Lecture 2: Flyweight Pattern
Lecture 3: Proxy Pattern

Student selects to play Lecture 2 (Flyweight Pattern):
Loading video: flyweight.mp4...
Video loaded: flyweight.mp4
Playing video: Flyweight Pattern

Student selects to play Lecture 1 (Introduction to Design Patterns):
Loading video: intro.mp4...
Video loaded: intro.mp4
Playing video: Introduction to Design Patterns

Student selects to play Lecture 3 (Proxy Pattern):
Loading video: proxy.mp4...
Video loaded: proxy.mp4
Playing video: Proxy Pattern
