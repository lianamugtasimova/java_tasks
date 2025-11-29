class Car {
    private String model;
    
    public Car(String model) {
        this.model = model;
    }
    
    @Override
    public String toString() {
        return model;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        int year = 2023;
        
        String result = "My car: " + car + " year " + year;
        System.out.println(result);
    }
}