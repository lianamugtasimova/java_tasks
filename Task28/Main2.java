// Публичный интерфейс  - доступен из любого пакета
public interface Interface {
    void method();
    String str = "Interface";
}

class ClassB implements Interface {
    public void method() {
        System.out.println("method in ClassB");
        System.out.println(str);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Interface obj = new ClassB();
        obj.method();
        
        // Публичный интерфейс доступен везде
        System.out.println("Interface str = " + Interface.str);
    }
}