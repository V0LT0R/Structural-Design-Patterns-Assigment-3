public class SmartHomeFacade {
    private Light lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light lights, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("\nLeaving home...");
        lights.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    public void arriveHome() {
        System.out.println("\nArriving home...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        entertainmentSystem.turnOn();
    }

    public void nightMode() {
        System.out.println("\nNight mode activated...");
        lights.dim();
        thermostat.setTemperature(20);
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    public void movieMode() {
        System.out.println("\nMovie mode activated...");
        lights.dim();
        entertainmentSystem.setMode("Movie");
    }
}
