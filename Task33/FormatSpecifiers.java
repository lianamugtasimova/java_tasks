public class FormatSpecifiers{
    public static void main(String[] args) {
        // %s - строковое представление
        String name = "Alex";
        System.out.printf("Name: %s%n", name);
        
        // %d - десятичное целое
        int age = 25;
        System.out.printf("Age: %d years old%n", age);
        
        // %f - число с плавающей точкой
        double price = 99.99;
        System.out.printf("Price: %.2f%n", price); //два знака после запытой
        
        // %c - символ
        char grade = 'A';
        System.out.printf("Grade: %c%n", grade);
        
        // %b - логическое значение
        boolean active = true;
        System.out.printf("status: %b%n", active);
        
        // %% - знак процента
        int discount = 15;
        System.out.printf("discount: %d%%%n", discount);
    }
}