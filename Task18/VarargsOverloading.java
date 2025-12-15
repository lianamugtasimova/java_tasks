public class VarargsOverloading {
    
    // 1. Метод без параметров
    public static void print() {
        System.out.println("No arguments");
    }
    
    // 2. Метод с одним параметром
    public static void print(String message) {
        System.out.println("One string: " + message);
    }
    
    // 3. Метод с varargs строк
    public static void print(String... messages) {
        if (messages.length == 0) {
            System.out.println("No strings provided");
        } else {
            System.out.print("Strings: ");
            for (String msg : messages) {
                System.out.print(msg + " ");
            }
            System.out.println();
        }
    }
    
    // 4. Метод с одним int и varargs int
    public static void print(int first, int... numbers) {
        System.out.print("First: " + first + ", Others: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // 5. Метод с varargs объектов
    public static void print(Object... objects) {
        System.out.print("Objects: ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    
    // 6. Метод с конкретными типами и varargs
    public static void print(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // 1. Вызов без параметров
        print();
        
        // 2. Вызов с одним параметром (выбирается наиболее специфичный)
        print("Hello");
        
        // 3. Вызов с varargs строками
        print("Java", "is", "awesome");
        print(new String[]{"Array", "of", "strings"});
        
        // 4. Вызов с одним int и varargs
        print(10, 20, 30, 40);
        
        // 5. Вызов с varargs объектов
        print("Text", 123, 45.67, true);
        
        // 6. Вызов с префиксом и числами
        print("Numbers", 1, 2, 3);
        
        // 7. Вызов с пустым varargs
        print(); // Вызовет print() 
        print(new String[0]); // Вызовет print(String...)
        
        // 8. Явное указание типа массива
        print((String) null); //  вызовет print(String)
        print((String[]) null); // вызовет print(String...)
    }
}