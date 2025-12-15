package example;
import other.OtherPackageClass;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicMethod();
        parent.protectedMethod();    // тот же пакет
        parent.defaultMethod();      // тот же пакет
        parent.privateMethod();    // Ошибка!
        
        Child child = new Child();
        child.testAccess();
        
        OtherPackageClass other = new OtherPackageClass();
        other.testAccess();
        
        // Вызов конструкторов
        Parent p1 = new Parent();           
        Parent p2 = new Parent(1);       // protected - ошибка из другого пакета
        Parent p3 = new Parent("test");  // default - ошибка из другого пакета
        Parent p4 = new Parent(true);    // private - ошибка всегда
    }
}