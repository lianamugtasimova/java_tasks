public class SwitchTypes {
    public static void main(String[] args) {
        // 1. Целочисленные типы
        byte byteValue = 1;
        switch(byteValue) {
            case 1: System.out.println("byte: 1"); break;
            case 2: System.out.println("byte: 2"); break;
        }
        
        short shortValue = 10;
        switch(shortValue) {
            case 10: System.out.println("short: 10"); break;
            case 20: System.out.println("short: 20"); break;
        }
        
        int intValue = 100;
        switch(intValue) {
            case 100: System.out.println("int: 100"); break;
            case 200: System.out.println("int: 200"); break;
        }
        
        char charValue = 'A';
        switch(charValue) {
            case 'A': System.out.println("char: A"); break;
            case 'B': System.out.println("char: B"); break;
        }
        
        // 2. String (с Java 7)
        String stringValue = "hello";
        switch(stringValue) {
            case "hello": System.out.println("String: hello"); break;
            case "world": System.out.println("String: world"); break;
        }
        
        // 3. Enum (с Java 5)
        Day day = Day.MONDAY;
        switch(day) {
            case MONDAY: System.out.println("Enum: Monday"); break;
            case TUESDAY: System.out.println("Enum: Tuesday"); break;
        }
        
        // 4. Обертки примитивов
        Integer integerValue = 5;
        switch(integerValue) {
            case 5: System.out.println("Integer: 5"); break;
            case 10: System.out.println("Integer: 10"); break;
        }
    }
    
    enum Day { MONDAY, TUESDAY, WEDNESDAY }
}