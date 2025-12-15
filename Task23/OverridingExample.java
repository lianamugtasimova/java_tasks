class Parent {
    String getValue() {
        return "Parent";
    }
    
    int getNumber() {
        return 10;
    }
}

class Child extends Parent {
    @Override
    String getValue() {
        return "Child"; // Правильное переопределение
    }
    
    // несовместимый тип возврата - ошибка
    // @Override
    // String getNumber() {  // Ожидается int
    //     return "10";
    // }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent ref = new Child(); 
        
        System.out.println("parent.getValue(): " + parent.getValue());
        System.out.println("child.getValue(): " + child.getValue());
        System.out.println("ref.getValue(): " + ref.getValue()); // Динамическое связывание
        
        System.out.println("\nparent.getNumber(): " + parent.getNumber());
        System.out.println("child.getNumber(): " + child.getNumber()); // Унаследованный метод
    }
}