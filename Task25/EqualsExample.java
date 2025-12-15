class Box {
    int size;
    
    Box(int size) {
        this.size = size;
    }
    
    // Переопределяем equals() для сравнения по размеру
    @Override
    public boolean equals(Object obj) {
        // Проверяем, тот же ли это объект
        if (this == obj) return true;
        
        // Проверяем, не null ли
        if (obj == null) return false;
        
        // Проверяем, тот же ли это класс
        if (getClass() != obj.getClass()) return false;
        
        // Теперь сравниваем размеры
        Box otherBox = (Box) obj;
        return this.size == otherBox.size;
    }
    
    @Override
    public int hashCode() {
        return size; 
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10); // Такая же по размеру
        Box box3 = new Box(20); // Другого размера
        Box box4 = box1; // Ссылка на тот же объект
        
        System.out.println("Сравнение:");
        System.out.println("box1 == box2: " + (box1 == box2)); // false (разные объекты в памяти)
        System.out.println("box1.equals(box2): " + box1.equals(box2)); // true (размер одинаковый)
        
        System.out.println("\nbox1.equals(box3): " + box1.equals(box3)); // false (размер разный)
        
        System.out.println("\nbox1 == box4: " + (box1 == box4)); // true (один и тот же объект)
        System.out.println("box1.equals(box4): " + box1.equals(box4)); // true
        
        System.out.println("\nbox1.equals(null): " + box1.equals(null)); // false
        System.out.println("box1.equals(\"строка\"): " + box1.equals("строка")); // false
    }
}