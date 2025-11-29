public class NullUnboxingExample {
    public static void main(String[] args) {
        Integer nullInteger = null;
        
        try {
            // Автораспаковка null выбросит NPE
            int i = nullInteger; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NPE при автораспаковке: " + e.getMessage());
        }
        
        // Другие примеры NPE при автораспаковке
        Boolean nullBoolean = null;
        try {
            boolean b = nullBoolean; // NPE
        } catch (NullPointerException e) {
            System.out.println("NPE с Boolean: " + e.getMessage());
        }
        
        // В арифметических операциях
        Integer nullInt = null;
        try {
            int result = nullInt + 10; // NPE
        } catch (NullPointerException e) {
            System.out.println("NPE в арифметике: " + e.getMessage());
        }
    }
}