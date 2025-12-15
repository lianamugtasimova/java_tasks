public class Outer {
    private String privateField = "private";
    String defaultField = "default";
    protected String protectedField = "protected";
    public String publicField = "public";
    
    private void privateMethod() {
        System.out.println("Outer private method");
    }
    
    void defaultMethod() {
        System.out.println("Outer default method");
    }
    
    protected void protectedMethod() {
        System.out.println("Outer protected method");
    }
    
    public void publicMethod() {
        System.out.println("Outer public method");
    }
    
    // Внутренний класс
    class Inner {
        public void accessOuter() {
            // Внутренний класс имеет доступ ко всем полям и методам внешнего
            System.out.println("Fields: " + privateField + ", " + defaultField + 
                             ", " + protectedField + ", " + publicField);
            
            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
            
            // Также доступ через Outer.this
            System.out.println("Outer.this.publicField: " + Outer.this.publicField);
        }
    }
    
    public void createAndTestInner() {
        Inner inner = new Inner();
        inner.accessOuter();
    }
}

public class InnerAccessExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createAndTestInner();
        
        // Также можно создать внутренний класс извне
        Outer.Inner inner = outer.new Inner();
        inner.accessOuter();
    }
}