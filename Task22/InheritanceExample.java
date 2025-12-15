class A {
    int a = 10;
    
    void method() {
        System.out.println("A.method() called");
    }
}

class B extends A {
    // Нет собственных полей a и метода method()
}

class C extends B {
    void method() {
        // super.a обращается к полю из A 
        int value = super.a; // Получаем a=10 из класса A
        System.out.println("Value from A: " + value);
        
        // super.method() вызывает метод из A
        super.method(); // Вызовет A.method()
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        C c = new C();
        c.method();
        B b = new B();
        System.out.println("b.a = " + b.a); // Унаследовано от A
        b.method(); // Унаследовано от A
    }
}