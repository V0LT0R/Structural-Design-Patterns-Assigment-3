public class SmartHomeApp {
    public static void main(String[] args) {
        // Create individual smart devices
        Light lights = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Create a SmartHomeFacade to simplify control
        SmartHomeFacade smartHome = new SmartHomeFacade(lights, thermostat, securitySystem, entertainmentSystem);

        // Demonstrating high-level commands
        smartHome.arriveHome();
        smartHome.movieMode();
        smartHome.nightMode();
        smartHome.leaveHome();
    }
}
