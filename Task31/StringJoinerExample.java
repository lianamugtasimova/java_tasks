import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Простое соединение с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Java").add("Python").add("C++");
        System.out.println("languages: " + sj1);
        
        // С разделителем, префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(" | ", "[", "]");
        sj2.add("one").add("two").add("three");
        System.out.println("numbers: " + sj2);
        
        // Пустой StringJoiner
        StringJoiner sj3 = new StringJoiner("-");
        System.out.println("empty: '" + sj3 + "'");
        
        // С пустым значением по умолчанию
        StringJoiner sj4 = new StringJoiner(", ", "{", "}");
        sj4.setEmptyValue("empty list");
        System.out.println(sj4);
        sj4.add("element");
        System.out.println(sj4);
        
        // Объединение двух StringJoiner
        StringJoiner sj5 = new StringJoiner(":");
        sj5.add("A").add("B ");
        
        StringJoiner sj6 = new StringJoiner("-");
        sj6.add("X").add("Y");
        
        sj5.merge(sj6);
        System.out.println("joined: " + sj5);
    }
}