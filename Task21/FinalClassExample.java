final class CannotExtend {
    void method() {}
}

// class TryToExtend extends CannotExtend {} // ошибка компиляции

class CanExtend {
    final void cannotOverride() {}
}

class Extender extends CanExtend {
    // void cannotOverride() {} // будет ошибка 
    
    void otherMethod() {} // работает
}

public class FinalClassExample {
    public static void main(String[] args) {
        System.out.println("Final class: cannot extend");
        System.out.println("Final method: cannot override");
    }
}