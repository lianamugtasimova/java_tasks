
package example;

public class Parent {
    // public - доступно везде
    public String publicField = "Public Field";
    
    // protected - доступно в том же пакете и наследникам
    protected String protectedField = "Protected Field";
    
    // default (package-private) - доступно только в том же пакете
    String defaultField = "Default Field";
    
    // private - доступно только внутри этого класса
    private String privateField = "Private Field";
    
    // Конструкторы с разным доступом
    public Parent() {
        System.out.println("Public constructor");
    }
    
    protected Parent(int x) {
        System.out.println("Protected constructor");
    }
    
    Parent(String s) {
        System.out.println("Default constructor");
    }
    
    private Parent(boolean b) {
        System.out.println("Private constructor");
    }
    
    // Методы с разным доступом
    public void publicMethod() {
        System.out.println("Public method called");
        // Внутри класса доступны все поля
        System.out.println("Inside class: " + privateField);
    }
    
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }
    
    void defaultMethod() {
        System.out.println("Default method called");
    }
    
    private void privateMethod() {
        System.out.println("Private method called");
    }
    
    public String getPrivateField() {
        return privateField; //работает внутри того же класса
    }
}
