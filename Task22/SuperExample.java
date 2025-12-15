class SuperClass {
    String field = "SuperClass field";
    
    SuperClass(String message) {
        System.out.println("SuperClass constructor: " + message);
    }
    
    void method() {
        System.out.println("SuperClass method");
    }
}

class SubClass extends SuperClass {
    String field = "SubClass field"; // Скрывает поле родителя
    
    SubClass() {
        super("called from SubClass"); // 1 Вызов конструктора суперкласса
        System.out.println("SubClass constructor");
    }
    
    void showFields() {
        System.out.println("this.field: " + this.field); // Свое поле
        System.out.println("super.field: " + super.field); // 2 Поле родителя
    }
    
    @Override
    void method() {
        System.out.println("SubClass method");
    }
    
    void callMethods() {
        System.out.println("\n=== Calling methods ===");
        this.method(); // Свой метод
        super.method(); // 3 метод родителя
    }
}

public class SuperExample {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.showFields();
        obj.callMethods();
    }
}