/**
 * Класс для выполнения базовых математических операций
 */
public class Calculator {
    
    /**
     * Складывает два числа и возвращает результат
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Проверяет, является ли число четным
     * 
     * @param number число для проверки
     * @return true если число четное, false если нечетное
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Главный метод для демонстрации работы класса
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int result = calc.add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        boolean even = calc.isEven(10);
        System.out.println("10 is even: " + even);
    }
}