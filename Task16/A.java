public class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }
    
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }
    
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }
    
    public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        
        // Массив типа Number - содержит разные типы
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        // 1. new Integer(1) - объект Integer
        // 2. 11 - int (автоупаковка в Integer)
        // 3. 1.11f - float (автоупаковка в Float)
        // 4. 11.11 - double (автоупаковка в Double)
        
        System.out.println("=== Цикл for (1) ===");
        // В цикле компилятор знает только, что n - Number
        // Выбор метода происходит на этапе компиляции
        // Компилятор видит что a.printNum(Number n) - только один подходящий метод
        for (Number n : num) {
            a.printNum(n);  // в любом случае вызовет printNum(Number n)
        }
        
        // Здесь компилятор видет РЕАЛЬНЫЕ типы аргументов
        // Выбор наиболее специфичного метода происходит на этапе компиляции
        a.printNum(new Integer(1));  // printNum(Integer i) - наиболее специфичный
        a.printNum(11);              // printNum(int i) - точное соответствие примитиву
        a.printNum(1.11f);           // printNum(Float f) - float -> Float
        a.printNum(11.11);           // printNum(Number n) - double -> Double, нет printNum(Double)
                                     // ближайший родитель - Number
    }
}
