// можно использовать try только с finally
public class TryFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            int result = 10 / 0; // Исключение
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues"); // Не выполнится
    }
}