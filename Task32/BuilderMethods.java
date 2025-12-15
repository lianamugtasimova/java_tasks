public class BuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // append() - добавление в конец
        sb.append(" World");
        System.out.println("append: " + sb);
        
        //insert() - вставка по индексу
        sb.insert(5, ",");
        System.out.println("insert: " + sb);
        
        //delete() - удаление части
        sb.delete(5, 7);
        System.out.println("delete: " + sb);
        
        //reverse() - обратный порядок
        sb.reverse();
        System.out.println("reverse: " + sb);
        
        //setCharAt() - замена символа
        sb.setCharAt(0, '!');
        System.out.println("setCharAt: " + sb);
        
        //replace() - замена подстроки
        sb.replace(0, 5, "Hello");
        System.out.println("replace: " + sb);
        
        //length() - длина
        System.out.println("length: " + sb.length());
        
        //capacity() - текущая емкость
        System.out.println("capacity: " + sb.capacity());
        
        //ensureCapacity() - гарантия емкости
        sb.ensureCapacity(50);
        System.out.println("capacity after ensure: " + sb.capacity());
        
        //substring() - получение подстроки
        System.out.println("substring(0,5): " + sb.substring(0, 5));
    }
}