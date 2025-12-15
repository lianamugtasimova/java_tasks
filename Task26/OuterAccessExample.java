public class Outer {
    // Создаем внутренние классы с разными модификаторами доступа
    public class PublicInner {
        public String publicField = "inner public";
        private String privateField = "inner private";
        
        public void publicMethod() {
            System.out.println("Inner public method");
        }
        
        private void privateMethod() {
            System.out.println("Inner private method");
        }
    }
    
    private class PrivateInner {
        public String field = "private inner field";
        
        public void show() {
            System.out.println("From private inner class");
        }
    }
    
    public void accessInnerClasses() {
// Внешний класс может создавать и использовать внутренние классы
        PublicInner pub = new PublicInner();
        PrivateInner priv = new PrivateInner();
        
        // Доступ к public полям и методам
        System.out.println(pub.publicField);
        pub.publicMethod();
        
        // Доступ к private полям и методам невозможен
        
        // Доступ к private внутреннему классу
        System.out.println(priv.field);
        priv.show();
    }
    
    public PublicInner getPublicInner() {
        return new PublicInner();
    }
}

public class OuterAccessExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInnerClasses();
        
        // Извне можно работать только с public inner class
        Outer.PublicInner inner = outer.new PublicInner();
        System.out.println("\nFrom outside: " + inner.publicField);
        inner.publicMethod();
    }
}