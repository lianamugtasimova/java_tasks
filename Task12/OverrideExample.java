class Device {
    protected String name;
    
    public Device(String name) {
        this.name = name;
    }
    
    // Базовый метод, который будем переопределять
    public void turnOn() {
        System.out.println(name + ": turn on devices");
    }
    
    public void showInfo() {
        System.out.println("device: " + name);
    }
}

class SmartDevice extends Device {
    private boolean connected;
    
    public SmartDevice(String name) {
        super(name);
        this.connected = false;
    }
    
    // Переопределение метода
    @Override
    public void turnOn() {
        super.turnOn();  // Вызов родительского метода
        connected = true;
    }
    
    // Дополнительный метод
    public void checkConnection() {
        System.out.println(name + " connected: " + connected);
    }
}

class SimpleDevice extends Device {
    public SimpleDevice(String name) {
        super(name);
    }
    
    // Переопределение с другой реализацией
    @Override
    public void turnOn() {
        System.out.println(name + ": turn on");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Device device1 = new Device("simple device");
        Device device2 = new SmartDevice("smart");
        Device device3 = new SimpleDevice("simple");
        
        device1.turnOn();  // Базовый метод
        System.out.println();
        
        device2.turnOn();  // Переопределенный в SmartDevice
        System.out.println();
        
        device3.turnOn();  // Переопределенный в SimpleDevice
        
        // Проверка instanceof и приведение типов
        if (device2 instanceof SmartDevice) {
            SmartDevice smart = (SmartDevice) device2;
            smart.checkConnection();
        }
    }
}