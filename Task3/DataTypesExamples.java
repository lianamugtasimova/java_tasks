public class DataTypesExamples {
    public static void main(String[] args) {
        short shortValue = 100;          
        short shortDefault = 0;          
        
        int intValue = 100000;             
        int intDefault = 0;              
        
        byte byteValue = 100;
        byte byteDefault = 0;
        
        long longValue = 10000000000L;  
        long longDefault = 0L;           
        
        float floatValue = 3.14f;    
        float floatDefault = 0.0f;    
        
        double doubleValue = 3.14159;    
        double doubleDefault = 0.0;      
        
        char charValue = 'A';   
        char charDefault = '\u0000';     
        char charZero = 0;               
        
        boolean boolValue = true;     
        boolean boolDefault = false;     
        
        System.out.println("short: " + shortValue + " / default: " + shortDefault);
        System.out.println("byte: " + byteValue + " / default: " + byteDefault);
        System.out.println("int: " + intValue + " / default: " + intDefault);
        System.out.println("long: " + longValue + " / default: " + longDefault);
        System.out.println("float: " + floatValue + " / default: " + floatDefault);
        System.out.println("double: " + doubleValue + " / default: " + doubleDefault);
        System.out.println("char: '" + charValue + "' / default: '" + charDefault + "'");
        System.out.println("boolean: " + boolValue + " / default: " + boolDefault);
    }
}