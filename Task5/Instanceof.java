class Vehicle {}
class Car extends Vehicle {}
class Bike extends Vehicle {}

public class Instanceof {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
        
        Object obj = "Text";
        String nullStr = null;
        
        // Проверки instanceof
        System.out.println("car instanceof Car: " + (car instanceof Car));      // true
        System.out.println("car instanceof Vehicle: " + (car instanceof Vehicle)); // true
        System.out.println("vehicle instanceof Car: " + (vehicle instanceof Car)); // false
        
        // С null всегда false
        System.out.println("nullStr instanceof String: " + (nullStr instanceof String)); // false
        
        // С Object и строками
        System.out.println("obj instanceof String: " + (obj instanceof String)); // true
        
        // Практическое использование
        checkType(car);     // Это машина
        checkType(bike);    // Это транспорт
        checkType(vehicle); // Это транспорт
        checkType(null);    // Null объект
    }
    
    public static void checkType(Object obj) {
        if (obj instanceof Car) {
            System.out.println("car");
        } else if (obj instanceof Vehicle) {
            System.out.println("vehicle");
        } else if (obj == null) {
            System.out.println("Null ");
        }
    }
}