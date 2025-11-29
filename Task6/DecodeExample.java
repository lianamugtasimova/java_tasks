public class DecodeExample {
    public static void main(String[] args) {
        // decode() понимает разные системы счисления
        Integer hex = Integer.decode("0xFF");     // 16-ричная (0x)
        Integer oct = Integer.decode("012");      // 8-ричная (0)
        Integer dec = Integer.decode("100");      // 10-ричная
        
        System.out.println("0xFF = " + hex);      // 255
        System.out.println("012 = " + oct);       // 10
        System.out.println("100 = " + dec);       // 100
        
        // Отрицательные числа
        Integer negHex = Integer.decode("-0x1A"); // -26
        System.out.println("-0x1A = " + negHex);
        
        // Для других типов
        Long longHex = Long.decode("0xFFFFFFFF"); // 4294967295
        System.out.println("0xFFFFFFFF = " + longHex);
    }
}