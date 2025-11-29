public class BooleanCreation {
    public static void main(String[] args) {
        // 1. valueOf(boolean)
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);
        
        // 2. valueOf(String)
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("false");
        Boolean b5 = Boolean.valueOf("TRUE"); // нечувствителен к регистру
        Boolean b6 = Boolean.valueOf("anything"); // false для любой строки кроме "true"
        
        // 3. Автоупаковка
        Boolean b7 = true;
        Boolean b8 = false;
        
        System.out.println("b1: " + b1);     // true
        System.out.println("b3: " + b3);     // true  
        System.out.println("b5: " + b5);     // true
        System.out.println("b6: " + b6);     // false
        System.out.println("b7: " + b7);     // true
    }
}