public class MixedTypeArithmetic {
    public static void main(String[] args) {
        int intVal = 10;
        double doubleVal = 3.5;
        float floatVal = 2.5f;
        long longVal = 100L;
        
        double result1 = intVal + doubleVal;
        System.out.println("int + double: " + intVal + " + " + doubleVal + " = " + result1);
        // int автоматически преобразуется в double
        
        float result2 = floatVal * longVal;
        System.out.println("float * long: " + floatVal + " * " + longVal + " = " + result2);
        // long автоматически преобразуется в float
        
        // double / int → double  
        double result3 = doubleVal / intVal;
        System.out.println("double / int: " + doubleVal + " / " + intVal + " = " + result3);
        // Объяснение: int преобразуется в double, сохраняется дробная часть
        
        // int / int → int (потеря дробной части!)
        int result4 = intVal / 3;
        System.out.println("int / int: " + intVal + " / 3 = " + result4);
        // Объяснение: целочисленное деление, дробная часть отбрасывается
        
        // double / double → double
        double result5 = intVal / 3.0;
        System.out.println("int / double: " + intVal + " / 3.0 = " + result5);
        // Объяснение: int преобразуется в double, сохраняется дробная часть
    }
}