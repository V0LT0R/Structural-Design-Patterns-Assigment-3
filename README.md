# Structural Design Patterns Assignments

This repository contains implementations of various design patterns in Java, demonstrating different real-world scenarios.

## Assignment 1: Adapter Pattern - Audio Player

### Overview
The **Adapter Pattern** is used to enable the existing `AudioPlayer` class to support playing new formats (WAV and AAC) without modifying the original class.

### Project Structure
- `AudioPlayer` Interface: Defines the method `play(String audioType, String fileName)`.
- `MP3Player` Class: Plays MP3 files.
- `WAVPlayer` and `AACPlayer` Interfaces: Define methods for playing WAV and AAC files respectively.
- `AdvancedAudioPlayer` Class: Implements both `WAVPlayer` and `AACPlayer`.
- `AudioAdapter` Class: Converts WAV and AAC files for the `AudioPlayer`.
- `MusicPlayerApp` Class: Demonstrates playing MP3, WAV, and AAC files through a unified interface.

### How to Run
1. Compile all Java files.
2. Run `MusicPlayerApp` to see the adapter pattern in action.

---

## Assignment 2: Bridge Pattern - Remote Control System

### Overview
The **Bridge Pattern** is used to decouple `RemoteControl` (abstraction) from `Device` (implementation), allowing for flexibility with different devices and remote controls.

### Project Structure
- `Device` Interface: Defines methods such as `powerOn()`, `powerOff()`, `setChannel(int channel)`, `setVolume(int volume)`.
- `TVDevice`, `DVDDevice`, `SoundSystemDevice`: Implementations of `Device` for different types of electronics.
- `RemoteControl` Abstract Class: Contains a reference to `Device`.
- `BasicRemote` and `AdvancedRemote`: Concrete classes for basic and advanced remote controls.
- `HomeEntertainmentSystem`: Demonstrates the bridge pattern.

### How to Run
1. Compile all Java files.
2. Run `HomeEntertainmentSystem` to see how remotes can work with different devices.

---

## Assignment 3: Composite Pattern - Menu System

### Overview
The **Composite Pattern** is used to create a hierarchical menu structure where both individual menu items and sub-menus can be handled uniformly.

### Project Structure
- `MenuComponent` Abstract Class: Defines methods like `getName()`, `getDescription()`, `getPrice()`, and `print()`.
- `MenuItem` Class: Represents individual dishes (leaf node).
- `Menu` Class: Can contain both `MenuItem` and other `Menu` objects (composite node).
- `RestaurantApp`: Demonstrates a multi-level menu structure.

### How to Run
1. Compile all Java files.
2. Run `RestaurantApp` to see the composite pattern in action with a hierarchical menu system.

---

## Assignment 4: Decorator Pattern - Pizza Ordering System

### Overview
The **Decorator Pattern** is used to allow dynamic customization of pizzas with various toppings, without modifying the base pizza classes.

### Project Structure
- `Pizza` Interface: Defines methods `getDescription()` and `getCost()`.
- `MargheritaPizza` and `VegetarianPizza`: Concrete pizza classes.
- `ToppingDecorator` Abstract Class: Base class for pizza decorators.
- `CheeseTopping`, `MushroomTopping`, `PepperoniTopping`: Concrete decorator classes for adding toppings.
- `PizzaShop`: Demonstrates creating pizzas with multiple toppings.

### How to Run
1. Compile all Java files.
2. Run `PizzaShop` to see how the decorator pattern allows flexible pizza customization.

---

## Assignment 5: Facade Pattern - Smart Home System

### Overview
The **Facade Pattern** provides a simplified interface (`SmartHomeFacade`) to control various smart home devices like lights, thermostat, security system, and entertainment system.

### Project Structure
- Smart Device Classes (`Light`, `Thermostat`, `SecuritySystem`, `EntertainmentSystem`): Each device has its own operations.
- `SmartHomeFacade` Class: Provides simplified methods like `leaveHome()`, `arriveHome()`, `nightMode()`, and `movieMode()`.
- `SmartHomeApp`: Demonstrates using the facade to control multiple devices with simple commands.

### How to Run
1. Compile all Java files.
2. Run `SmartHomeApp` to see how the facade simplifies control of the smart home system.

---

## Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor

### Overview
The **Flyweight Pattern** optimizes memory usage when rendering large amounts of text by sharing common character data (like font and size).

### Project Structure
- `Character` Class: Holds intrinsic state (character value, font, size) and extrinsic state (position).
- `CharacterFactory` Class: Manages shared flyweight objects.
- `TextEditor`: Uses `CharacterFactory` to render text efficiently.
- `TextEditorApp`: Demonstrates memory efficiency by rendering large amounts of text.

### How to Run
1. Compile all Java files.
2. Run `TextEditorApp` to see how the flyweight pattern optimizes memory usage when rendering text.

---

## Assignment 7: Proxy Pattern - Online Learning Platform

### Overview
The **Proxy Pattern** is used to implement lazy loading for video lectures, where videos are loaded only when a student starts watching them.

### Project Structure
- `VideoLecture` Interface: Defines `getInfo()` and `play()` methods for video lectures.
- `RealVideoLecture`: Simulates loading and playing a video lecture.
- `ProxyVideoLecture`: Implements lazy loading, creating the `RealVideoLecture` object only when `play()` is called.
- `OnlineCourse`: Contains multiple `ProxyVideoLecture` objects.
- `LearningPlatformApp`: Demonstrates lazy loading of lectures when a student plays them.

### How to Run
1. Compile all Java files.
2. Run `LearningPlatformApp` to see how the proxy pattern defers loading of video lectures until they are played.

---
Made by Biloshchytskyi Yevhenii
