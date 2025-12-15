class A {
    int defaultField;        
    public int publicField;
    protected int protectedField;
    private int privateField;
    
    // Конструктор
    public A() {
        defaultField = 1;
        publicField = 2;
        protectedField = 3;
        privateField = 4;
    }
    
    void defaultMethod() {
        System.out.println("A: default method");
    }
    
    public void publicMethod() {
        System.out.println("A: public method");
    }
    
    protected void protectedMethod() {
        System.out.println("A: protected method");
    }
    
    private void privateMethod() {
        System.out.println("A: private method");
    }
    
    // Метод для доступа к private полю
    public int getPrivateField() {
        return privateField;
    }
}

class B extends A {
    public void testAccessInB() {
        // default - доступно 
        System.out.println("defaultField: " + defaultField);
        defaultMethod();
        
        // public - доступно
        System.out.println("publicField: " + publicField);
        publicMethod();
        
        // protected - доступно (наследник)
        System.out.println("protectedField: " + protectedField);
        protectedMethod();
        
        // private - не доступно напрямую
        
        // Доступ через public метод
        System.out.println("privateField: " + getPrivateField());
    }
}

class C extends B {
    public void testAccessInC() {
        // Все то же самое - доступ к унаследованным полям и методам
        System.out.println("defaultField from A: " + defaultField);
        System.out.println("publicField from A: " + publicField);
        System.out.println("protectedField from A: " + protectedField);
        
        defaultMethod();
        publicMethod();
        protectedMethod();
    }
}

public class Example {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        // Из класса A доступно все
        a.defaultMethod();      
        a.publicMethod();     
        a.protectedMethod();    
        
        // Из класса B
        b.testAccessInB();
        
        // Из класса C
        c.testAccessInC();
        
        // Обращение к объектам через родительский тип
        A bAsA = new B();
        A cAsA = new C();
        
        // Через ссылку типа A доступно только public и protected
        bAsA.publicMethod();     
        bAsA.protectedMethod();  
    }
}