// Интерфейс с областью видимости по умолчанию
// Доступен только в том же пакете, где объявлен
interface Interface {
    // Все методы в интерфейсе по умолчанию public abstract
    void method();
    
    // Все поля в интерфейсе по умолчанию public static final
    int CONSTANT = 100;
}

class ClassA implements Interface {
    // Реализация обязательного метода из интерфейса
    public void method() {
        System.out.println("method in ClassA");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Interface obj = new ClassA();
        obj.method();
        
        // Доступ к константе интерфейса
        System.out.println("Interface1.CONSTANT = " + Interface.CONSTANT);
    }
}