package other;

import example.Parent;
import example.Child;

public class OtherPackageClass {
    public void testAccess() {
        Parent parent = new Parent();
        
        // public - доступно
        System.out.println("publicField: " + parent.publicField);
        parent.publicMethod();
        
        // protected - не доступно 
        System.out.println(parent.protectedField); // Ошибка
        parent.protectedMethod(); // Ошибка
        
        // default - не доступно 
        System.out.println(parent.defaultField); // Ошибка
        parent.defaultMethod(); // Ошибка
        
        // private -  недоступно 
        System.out.println(parent.privateField); // Ошибка
        parent.privateMethod(); // Ошибка
        
        // Использование наследника из другого пакета
        Child child = new Child();
        
        // public - доступно
        child.publicMethod();
        
        child.protectedMethod(); // Ошибка из другого класса
        
        // Но в классе-наследнике можно вызвать protected методы
        child.testAccess();
    }
}