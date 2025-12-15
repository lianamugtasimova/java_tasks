public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        try {
            // это исключение перехвачено
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing array element: " + numbers[2]); 
            System.out.println("Accessing array element: " + numbers[5]); // исключение
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: Array index out of bounds");
        }
        
        System.out.println("Continuing execution after first try-catch");
        
        // это исключение приведет к остановке
        String text = null;
        System.out.println("String length: " + text.length()); // NullPointerException
        
        // эта часть выполнена не будет..
        System.out.println("Program finished successfully");
    }
}