public class MultipleExceptions {
    
    // Обработка нескольких исключений одинаковым образом
    public static void example1() {
        try {
            int choice = (int)(Math.random() * 3);
            
            switch(choice) {
                case 0:
                    int result = 10 / 0; // ArithmeticException
                    break;
                case 1:
                    String str = null;
                    str.length(); // NullPointerException
                    break;
                case 2:
                    int[] arr = new int[3];
                    System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
                    break;
            }
        } catch (ArithmeticException | NullPointerException | 
                 ArrayIndexOutOfBoundsException e) {
            // Одинаковая обработка для всех трёх исключений
            System.out.println("Error occurred: " + e.getClass().getSimpleName());
        }
    }
    
    //Исключения с иерархией
    static class Ex1 extends Exception {}
    static class Ex2 extends Ex1 {}
    static class Ex3 extends Ex2 {}
    
    public static void example2() {
        try {
            throw new Ex3(); // Самый конкретный тип
        } catch (Ex3 e) {
            System.out.println("Caught Ex3");
        } catch (Ex2 e) {
            System.out.println("Caught Ex2");
        } catch (Ex1 e) {
            System.out.println("Caught Ex1");
        }
        
        // приведет к ошибке компиляции:
        // catch (Ex1 | Ex2 e) {} // Ex2 - подкласс Ex1
        
        // правильный подход: разные ветви иерархии:
        // catch (Ex1 | RuntimeException e) {}
    }
    
    public static void main(String[] args) {
        example1();
        example2();
    }
}