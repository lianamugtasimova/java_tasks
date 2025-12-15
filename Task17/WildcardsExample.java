import java.util.ArrayList;
import java.util.List;

public class WildcardsExample {
    public static void main(String[] args) {
        // Создаем списки разных типов
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        
        // Заполняем
        integers.add(10);
        integers.add(20);
        
        doubles.add(3.14);
        doubles.add(2.71);
        
        // Метод принимает список любых чисел
        printNumbers(integers); //  Integer extends Number
        printNumbers(doubles);  // Double extends Number
        
        // Метод может добавлять Integer в список
        addNumber(numbers, 100);  //  Number super Integer
        addNumber(integers, 200); // Integer super Integer
        
        System.out.println("\nnumbers: " + numbers);
        System.out.println("integers: " + integers);
        
        copyNumbers(integers, numbers); // Из integers (производитель) в numbers (потребитель)
        System.out.println("После копирования numbers: " + numbers);
    }
    
    // Можем читать как Number, но не можем добавлять
    public static void printNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) { // Читаем как Number
            sum += num.doubleValue();
            System.out.println("Число: " + num);
        }
        System.out.println("Сумма: " + sum);
    }
    
    // Можем добавлять Integer, но читаем только как Object
    public static void addNumber(List<? super Integer> list, Integer value) {
        list.add(value); // Можем добавлять Integer
        System.out.println("Добавили: " + value);
        
        // Читать можем только как Object
        Object obj = list.get(0);
        System.out.println("Первый элемент: " + obj);
    }
    
    public static void copyNumbers(List<? extends Number> source, 
                                   List<? super Number> destination) {
        for (Number num : source) {
            destination.add(num);
        }
    }
}