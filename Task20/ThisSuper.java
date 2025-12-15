class Parent {
    String name = "Parent";
    
    void print() {
        System.out.println("Parent method");
    }
    
    void show() {
        System.out.println("Show from Parent");
    }
}

class Child extends Parent {
    String name = "Child"; // Переопределение поля
    
    void demonstrate() {
        //this обращение к текущему объекту 
        System.out.println("this.name = " + this.name); // "Child"
        //super - обращение к родительской версии
        System.out.println("super.name = " + super.name); // "Parent"
        
        this.print(); // Вызовит Child.print()
        
        super.print(); // Вызовит Parent.print()
    }
    
    // Переопределение метода
    @Override
    void print() {
        System.out.println("Child method");
    }
    
    // Вызов родительского метода в переопределенном
    @Override
    void show() {
        System.out.println("Before super.show()");
        super.show(); // Вызов родительской версии
        System.out.println("After super.show()");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child child = new Child();
        child.demonstrate();
        child.show();
    }
}