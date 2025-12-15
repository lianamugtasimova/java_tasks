class Base {
    void display() {
        System.out.println("Base display");
    }
    
    void show(String message) {
        System.out.println("Base: " + message);
    }
}

class Derived extends Base {
    // 1 Правильное переопределение
    @Override
    void display() {
        System.out.println("Derived display");
    }
    
    // 2 опечатка в имени метода
    @Override
    void Display() {  // Не переопределяет display()
        System.out.println("Wrong spelling");
    }
    
    // 3 неверный тип параметра
    @Override
    void show(int number) {  // Ожидается String
        System.out.println(number);
     }
    
    // 4 Правильное переопределение
    @Override
    void show(String message) {
        System.out.println("Derived: " + message);
    }
    
    // новый метод 
    void show(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}

public class AnnotationExample {
    public static void main(String[] args) {
        Derived obj = new Derived();
        
        obj.display();
        obj.show("Hello");
        obj.show("Hi", 3);
    }
}