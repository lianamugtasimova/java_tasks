public class StringMethods {
    public static void main(String[] args) {
        String text = "  Hello, World!  ";
        String another = "hello, world!";
        
        // length() - возвращает длину строки
        System.out.println(text.length());
        
        // trim() - удаляет пробелы в начале и конце
        System.out.println("'" + text.trim() + "'");
        
        // toUpperCase() - преобразует в верхний регистр
        System.out.println(text.toUpperCase());
        
        // toLowerCase() - преобразует в нижний регистр
        System.out.println(text.toLowerCase());
        
        // equals() - сравнение с учетом регистра
        System.out.println(text.trim().equals(another));
        
        //equalsIgnoreCase() - сравнение без учета регистра
        System.out.println(text.trim().equalsIgnoreCase(another));
        
        // contains() - проверка наличия подстроки
        System.out.println(text.contains("Java"));
        
        //substring() - извлечение подстроки
        System.out.println(text.substring(7, 11));
        
        //replace() - замена символов/подстрок
        System.out.println(text.replace('o', '0'));
        
        // split() - разделение строки на массив
        String[] words = text.trim().split(" ");
        System.out.println("amount of words " + words.length);
    }
}