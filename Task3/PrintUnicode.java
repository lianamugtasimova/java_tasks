public class PrintUnicode {
    public static void main(String[] args) {
        char L = '\u004C';  // L
        char i = '\u0069';  // i
        char a = '\u0061';  // a
        char n = '\u006E';  // n
        
        String name = "" + L + i + a + n + a;
        System.out.println(name);
    }
}