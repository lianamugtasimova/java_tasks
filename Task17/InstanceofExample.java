import java.util.ArrayList;
import java.util.List;

public class InstanceofExample {
    public static void main(String[] args) {
        // Создаем параметризованные объекты
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<?> wildcardList = new ArrayList<>();
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        // 1. Проверка самого класса 
        System.out.println("stringList instanceof List: " + (stringList instanceof List)); // true
        System.out.println("stringList instanceof ArrayList: " + (stringList instanceof ArrayList)); // true
        
        // 3. Можно проверять с wildcard 
        System.out.println("stringList instanceof List<?>: " + (stringList instanceof List<?>)); // true
        
        // 4. Raw type проверка
        List rawList = new ArrayList();
        System.out.println("rawList instanceof List: " + (rawList instanceof List)); // true
        
        // 5. Практический пример с кастингом
        Object obj = new ArrayList<String>();
        
        if (obj instanceof List) { // Всегда List<?> из-за стирания типов
            List<?> list = (List<?>) obj;
            System.out.println("Кастинг успешен, размер: " + list.size());
        }
        
        // 6. Пример с проверкой до кастинга
        checkAndProcess(stringList);
        checkAndProcess(integerList);
        checkAndProcess("Это не список");
    }
    
    public static void checkAndProcess(Object obj) {
        if (obj instanceof List) {
            // Из-за стирания типов не знаем, какой именно List
            List<?> list = (List<?>) obj;
            System.out.println("Object is list with size: " + list.size());
            
        } else {
            System.out.println("Object is not list with size: " + obj.getClass());
        }
    }
}