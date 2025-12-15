package example;

public class Child extends Parent {
    public void testAccess() {
        // public - доступно
        System.out.println("publicField: " + publicField);
        publicMethod();
        
        // protected - доступно (наследник)
        System.out.println("protectedField: " + protectedField);
        protectedMethod();
        
        // default - доступно (тот же пакет)
        System.out.println("defaultField: " + defaultField);
        defaultMethod();
        
        // private - НЕ доступно
        System.out.println(privateField); // Ошибка
        privateMethod(); // Ошибка
        
        // Но можно через public геттер
        System.out.println("Private via getter: " + getPrivateField());
    }
}
