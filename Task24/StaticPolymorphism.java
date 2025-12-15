class Parent {
    // Статический метод - принадлежит классу Parent, а не объектам
    public static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    // Это переопределение а скрытие
    // Статический метод show теперь принадлежит классу Child
    public static void show() {
        System.out.println("Child static method");
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        // Статические методы всегда следует вызывать через имя класса
        Parent.show();  // Вызывается Parent.show()
        Child.show();   // Вызывается Child.show()
        
        // Создаем объект Child, но ссылаемся на него через Parent
        Parent reference = new Child(); // Полиморфная ссылка
        
        // Здесь ожидается Child.show() (полиморфизм), но вызывается Parent.show()
        reference.show(); //Статические методы связываются на этапе компиляции, компилтор смотрит на тип переменной, а не на фактический тип объекта
    }
}