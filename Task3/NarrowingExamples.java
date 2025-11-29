public class NarrowingExamples {
    public static void main(String[] args) {
        double d = 123.456;
        float f = (float) d;     // сужаем double до float
        long l = (long) f;       // сужаем float до long 
        int i = (int) l;         // сужаем long до int
        short s = (short) i;     // сужаем int до short
        byte b = (byte) s;       // сужаем short до byte
        
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
        
        int bigNumber = 1000;
        byte smallByte = (byte) bigNumber; 
        System.out.println("int: " + bigNumber + " -> byte: " + smallByte);
        
        double precise = 3.14159;
        int rough = (int) precise;     
        System.out.println("double: " + precise + " -> int: " + rough);
        
        int code = 65;
        char letter = (char) code;          
        System.out.println("int: " + code + " -> char: '" + letter + "'");
        
        long huge = 128L;
        byte tiny = (byte) huge;            
        System.out.println("long: " + huge + " → byte: " + tiny);
    }
}