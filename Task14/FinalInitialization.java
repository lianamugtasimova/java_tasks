public class FinalInitialization {
    // 1. При объявлении
    public final int VALUE1 = 10;
    
    // 2. В конструкторе
    public final int VALUE2;
    
    // 3. В блоке инициализации
    public final int VALUE3;
    
    // 4. Параметризированный конструктор
    public final int VALUE4;
    
    // 5. Через метод
    public final int VALUE5;
    
    // Блок инициализации
    {
        VALUE3 = 30;
    }
    
    // Конструкторы
    public FinalInitialization() {
        VALUE2 = 20;
        VALUE4 = 40;
        VALUE5 = calculateValue();
    }
    
    public FinalInitialization(int customValue) {
        VALUE2 = 20;
        VALUE4 = customValue;  // Разные значения для разных объектов
        VALUE5 = calculateValue();
    }
    
    private int calculateValue() {
        return 50;
    }
    
    // 6. Статическая константа
    public static final int STATIC_CONSTANT;
    
    static {
        STATIC_CONSTANT = 100;
    }
    
    // Демонстрация
    public static void main(String[] args) {
        FinalInitialization obj1 = new FinalInitialization();
        FinalInitialization obj2 = new FinalInitialization(99);
        
        System.out.println("obj1.VALUE1: " + obj1.VALUE1);  // 10
        System.out.println("obj1.VALUE2: " + obj1.VALUE2);  // 20
        System.out.println("obj1.VALUE3: " + obj1.VALUE3);  // 30
        System.out.println("obj1.VALUE4: " + obj1.VALUE4);  // 40
        System.out.println("obj1.VALUE5: " + obj1.VALUE5);  // 50
        
        System.out.println("\nobj2.VALUE4: " + obj2.VALUE4);  // 99
        
        System.out.println("\nSTATIC_CONSTANT: " + STATIC_CONSTANT);  // 100
    }
}