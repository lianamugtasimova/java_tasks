class A {
    int a;
    int b;
    int c;
    int z;
    
    public A() {
        this(0, 0, 0); // Вызов конструктора с 3 параметрами
    }
    
    // Конструктор с одним параметром
    public A(int a) {
        this(a, 0, 0); 
    }
    
    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a, b, 0); 
    }
    
    // Основной конструктор с тремя параметрами
    public A(int a, int b, int c) {
        // this() должен быть первым оператором
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; 
    }
    
    public void print() {
        System.out.printf("a=%d, b=%d, c=%d, z=%d%n", a, b, c, z);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.print("new A(): ");
        obj1.print();
        
        A obj2 = new A(10);
        System.out.print("new A(10): ");
        obj2.print();
        
        A obj3 = new A(20, 30);
        System.out.print("new A(20, 30): ");
        obj3.print();
        
        A obj4 = new A(40, 50, 60);
        System.out.print("new A(40, 50, 60): ");
        obj4.print();
    }
}