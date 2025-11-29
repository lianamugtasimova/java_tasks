public class TernaryExample {
    public static void main(String[] args) {
        // Тестируем разные значения a
        testWithValue(1); 
        testWithValue(2);   
        testWithValue(5);  
    }
    
    public static void testWithValue(int a) {
        // Тернарная версия
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        
        System.out.println("a = " + a + " -> i = " + i);
    }
}