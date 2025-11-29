public class AllOperatorsExample {
    public static void main(String[] args) {
        // Инициализация переменных
        int x = 10, y = 3, z = 0;
        double d = 5.5;
        boolean b1 = true, b2 = false;
        String str1 = "Hello", str2 = "World";
        
        // 1. Арифметические операторы
        System.out.println("x + y = " + (x + y));   // 13
        System.out.println("x - y = " + (x - y));   // 7
        System.out.println("x * y = " + (x * y));   // 30
        System.out.println("x / y = " + (x / y));   // 3
        System.out.println("x % y = " + (x % y));   // 1
        
        // 2. Операторы присваивания
        z = x + y;
        System.out.println("z = x + y: " + z);      // 13
        
        z += 5;  // z = z + 5
        System.out.println("z += 5: " + z);         // 18
        
        z -= 3;  // z = z - 3
        System.out.println("z -= 3: " + z);         // 15
        
        z *= 2;  // z = z * 2
        System.out.println("z *= 2: " + z);         // 30
        
        z /= 5;  // z = z / 5
        System.out.println("z /= 5: " + z);         // 6
        
        z %= 4;  // z = z % 4
        System.out.println("z %= 4: " + z);         // 2
        
        // 3. Операторы сравнения
        System.out.println("x == y: " + (x == y));   // false
        System.out.println("x != y: " + (x != y));   // true
        System.out.println("x > y: " + (x > y));     // true
        System.out.println("x < y: " + (x < y));     // false
        System.out.println("x >= y: " + (x >= y));   // true
        System.out.println("x <= y: " + (x <= y));   // false
        
        // 4. Логические операторы
        System.out.println("b1 && b2: " + (b1 && b2));  // false
        System.out.println("b1 || b2: " + (b1 || b2));  // true
        System.out.println("!b1: " + (!b1));            // false
        
        // 5. Побитовые операторы
        int a = 5, b = 3;  // 5 = 101, 3 = 011
        System.out.println("a & b: " + (a & b));    // 1 (001)
        System.out.println("a | b: " + (a | b));    // 7 (111)
        System.out.println("a ^ b: " + (a ^ b));    // 6 (110)
        System.out.println("~a: " + (~a));          // -6
        
        // 6. Операторы сдвига
        int num = 8;  // 1000
        System.out.println("num << 1: " + (num << 1));  // 16 (10000)
        System.out.println("num >> 1: " + (num >> 1));  // 4 (100)
        System.out.println("num >>> 1: " + (num >>> 1)); // 4
        
        // 7. Унарные операторы (префиксная и постфиксная форма)
        int pre = 5, post = 5;
        System.out.println("++pre: " + (++pre));    // 6 
        System.out.println("post++: " + (post++));  // 5 
        System.out.println("post после: " + post);  // 6
        
        pre = 5; post = 5;
        System.out.println("--pre: " + (--pre));    // 4
        System.out.println("post--: " + (post--));  // 5
        System.out.println("post после: " + post);  // 4
        
        System.out.println("!true: " + (!true));    // false
        System.out.println("~5: " + (~5));          // -6
        
        System.out.println("\n=== СТРОКИ (String) ===");
        
        // 8. Операторы для String
        String result = str1 + " " + str2;
        System.out.println("str1 + str2: " + result);  // "Hello World"
        
        str1 += " Java";
        System.out.println("str1 += ' Java': " + str1); // "Hello Java"
        
        // 9. Сравнение строк
        String s1 = "text";
        String s2 = "text";
        String s3 = new String("text");
        
        System.out.println("s1 == s2: " + (s1 == s2));       // true 
        System.out.println("s1 == s3: " + (s1 == s3));       // false 
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        
        // 10. Тернарный оператор
        int age = 20;
        String status = (age >= 18) ? "совершеннолетний" : "несовершеннолетний";
        System.out.println("Статус: " + status);
        
        // 11. Приоритет операторов 
        int calc1 = 2 + 3 * 4;      // 14 
        int calc2 = (2 + 3) * 4;    // 20 
        System.out.println("2 + 3 * 4 = " + calc1);
        System.out.println("(2 + 3) * 4 = " + calc2);
    }
}