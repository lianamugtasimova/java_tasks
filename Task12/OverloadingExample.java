class Calculator {
    
    // Перегрузка по количеству параметров
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Перегрузка по типам параметров
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    // Перегрузка с разным порядком типов
    public void print(int number, String text) {
        System.out.println(number + ": " + text);
    }
    
    public void print(String text, int number) {
        System.out.println(text + " - " + number);
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("add(2, 3): " + calc.add(2, 3));           // 5
        System.out.println("add(2, 3, 4): " + calc.add(2, 3, 4));     // 9
        System.out.println("add(2.5, 3.5): " + calc.add(2.5, 3.5));   // 6.0
        System.out.println("add('Hello', ' World'): " + 
                          calc.add("Hello", " World"));  // "Hello World"
        
        calc.print(1, "Test");  // "1: Test"
        calc.print("Test", 1);  // "Test - 1"
    }
}
