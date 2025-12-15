// Два интерфейса с одинаковыми методами
interface Logger {
    default void log(String message) {
        System.out.println("Logger: " + message);
    }
}

interface Debugger {
    default void log(String message) {
        System.out.println("Debug: " + message);
    }
}

// Класс, реализующий оба интерфейса вызовет компиляционную ошибку
// class Service implements Logger, Debugger { }

// Решение 1: Явное переопределение конфликтующего метода
class Service1 implements Logger, Debugger {
    @Override
    public void log(String message) {
        System.out.println("Service log: " + message);
    }
}

// 2: Выбор конкретной реализации из одного интерфейса
class Service2 implements Logger, Debugger {
    @Override
    public void log(String message) {
        Logger.super.log(message); // Вызываем конкретную реализацию
    }
}

// 3: Вызов обоих методов
class Service3 implements Logger, Debugger {
    @Override
    public void log(String message) {
        Logger.super.log(message);
        Debugger.super.log(message);
    }
}

// 4: Раздельное использование через разные методы
class Service4 implements Logger, Debugger {
    public void logAsLogger(String message) {
        Logger.super.log(message);
    }
    
    public void logAsDebugger(String message) {
        Debugger.super.log(message);
    }
    
    // Должен быть переопределен основной метод
    @Override
    public void log(String message) {
        logAsLogger(message);
    }
}

class Main2 {
    public static void main(String[] args) {
        Service1 s1 = new Service1();
        s1.log("test"); // "Service log: test"
        
        Service2 s2 = new Service2();
        s2.log("test"); // "Logger: test"
        
        Service3 s3 = new Service3();
        s3.log("test"); // "Logger: test" и "Debug: test"
    }
}