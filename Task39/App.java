public class App {
    final static int START_COUNTER;
    
    static {
        // будет ошибка: NumberFormatException при инициализации класса
        // "Y-" не является корректным числом
        START_COUNTER = Integer.parseInt("Y-");
    }
    
    public static void main(String[] args) {
        // Этот код не выполнится, так как произошла ошибка при инициализации статического блока
        System.out.println("Hello");
    }
}