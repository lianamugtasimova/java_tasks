//Статический вложенный класс
class OuterClass {
    private static String staticField = "Static field";
    private String instanceField = "Instance field";
    
    // Статический вложенный класс
    public static class NestedClass {
        public void show() {
            // Имеет доступ только к статическим членам внешнего класса
            System.out.println("Can access: " + staticField);
        }
    }
}

// Класс внутри интерфейса
interface MyInterface {
    // Константа в интерфейсе
    String INTERFACE_CONSTANT = "Interface constant";
    
    // Метод интерфейса
    void interfaceMethod();
    
    // Статический вложенный класс в интерфейсе
    class InterfaceInnerClass {
        public void show() {
            System.out.println("=== Class inside Interface ===");
            System.out.println("Can access: " + INTERFACE_CONSTANT);
        }
        
        public static void staticMethod() {
            System.out.println("Static method in interface class");
        }
    }
}

// Реализация интерфейса
class MyImplementation implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Interface method implemented");
    }
}

public class NestedExample {
    public static void main(String[] args) {
        // Создание без экземпляра OuterClass
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.show();
        
        // Создание класса из интерфейса
        MyInterface.InterfaceInnerClass inner = new MyInterface.InterfaceInnerClass();
        inner.show();
        
        // Вызов статического метода
        MyInterface.InterfaceInnerClass.staticMethod();
        
        MyInterface impl = new MyImplementation();
        impl.interfaceMethod();
        
        // Можно создать внутренний класс через реализацию
        MyInterface.InterfaceInnerClass inner2 = new MyInterface.InterfaceInnerClass();
        inner2.show();
    }
}