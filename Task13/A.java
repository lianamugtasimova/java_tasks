public class A {
    public static int a = 1;
    public static int b;
    
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    public static void main(String[] args) {
        
        // Способ 1: Через имя класса 
        A.printVars();
        
        // Способ 2: Через экземпляр класса
        A obj1 = new A();
        obj1.printVars();
        
        // Способ 3: Через другой экземпляр (результат тот же)
        A obj2 = new A();
        obj2.printVars();
        
        // Способ 4: Из другого статического метода того же класса
        callFromStaticMethod();
        
        // Способ 5: Из нестатического метода того же класса
        A obj3 = new A();
        obj3.callFromInstanceMethod();
        
        // Способ 6: Внутри самого класса 
        printVars(); // Неявный вызов A.printVars()
    }
    
    public static void callFromStaticMethod() {
        printVars(); 
    }
    
    public void callFromInstanceMethod() {
        printVars(); 
    }
}