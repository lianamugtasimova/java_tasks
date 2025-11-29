public class BreakContinue {
    public static void main(String[] args) {
        // break - полный выход из цикла
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // выходим из цикла
            }
            System.out.println("i = " + i);
        }
        
        // continue - пропуск текущей итерации
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // если четное
                continue; // пропускаем остаток итерации
            }
            System.out.println("odd number: " + i);
        }
        
        // Выход из вложенных циклов
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer; // выходим из внешнего цикла
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        int count = 0;
        while (count < 10) {
            count++;
            if (count % 3 == 0) {
                continue; // пропускаем числа кратные 3
            }
            System.out.println("count = " + count);
        }
    }
}
