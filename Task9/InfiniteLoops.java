public class InfiniteLoops {
    public static void main(String[] args) {
        System.out.println("=== Бесконечные циклы ===");
        
        // 1. Бесконечный while
        while (true) {
            System.out.println("infinite loop");
         }
        
        // 2. Бесконечный do-while
        do {
            System.out.println("another infinite loop");
        } while (true);
        
        // 3. Другие варианты бесконечных циклов
        int x = 1;
        while (x > 0) { // всегда true
            System.out.println("x = " + x);
        }
        
        for (;;) {
            System.out.println("infinite for");
        }
        
    }
}