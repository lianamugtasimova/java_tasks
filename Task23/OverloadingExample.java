class Calculator {
    // 1 разные типы параметров
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    // 2 разное количество параметров
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // 3 разный порядок типов
    String combine(String a, int b) {
        return a + b;
    }
    
    String combine(int a, String b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("add(int, int): " + calc.add(5, 3));
        System.out.println("add(double, double): " + calc.add(5.5, 3.3));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
        System.out.println("combine(String, int): " + calc.combine("Number: ", 100));
        System.out.println("combine(int, String): " + calc.combine(100, " is number"));
    }
}
