class Parent {
    // Обычный метод - можно переопределить
    public void normalMethod() {
        System.out.println("Parent: normal method");
    }
    
    // Final метод - нельзяя переопределить
    public final void finalMethod() {
        System.out.println("Parent: final method");
    }
}

class Child extends Parent {
    // Можно переопределить обычный метод
    @Override
    public void normalMethod() {
        System.out.println("Child: overridden normal method");
    }
    
    //  ошибка компиляции
    @Override
    public void finalMethod() {
        System.out.println("Trying to override final method");
     }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        // Вызов методов у родителя
        parent.normalMethod();
        parent.finalMethod();
        
        System.out.println();
        
        // Вызов методов у ребенка
        child.normalMethod();  
        child.finalMethod();   
        
        // Можно вызвать родительскую версию 
        testInheritance();
    }
    
    public static void testInheritance() {
        Child child = new Child();
        
        Parent reference = child;
        
        reference.normalMethod();  // Динамическое связывание - вызовется Child версия
        reference.finalMethod();   // Всегда Parent версия 
    }
}