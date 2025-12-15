// 1. @Override - указывает, что метод переопределяет метод родительского класса
// Компилятор проверит, что такой метод действительно существует в родительском классе/интерфейсе
class DataProcessor {
    public void process(String data) {
        // базовая реализация
    }
}

class AdvancedProcessor extends DataProcessor {
    @Override  // Если бы опечатались в имени метода, компилятор выдаст ошибку
    public void process(String data) {
        // расширенная реализация
    }
}

// 2. @Deprecated - помечает устаревший код, который не рекомендуется использовать
class LegacyService {
    @Deprecated
    public String processOld(String input) {
        return input.toUpperCase(); 
    }
    
    @Deprecated(since = "2.0", forRemoval = true) // с указанием версии и флагом удаления
    public void obsoleteMethod() {
        // устаревший метод
    }
    
    public String processNew(String input) {
        return input.toLowerCase(); // новая логика
    }
}

// 3. @SuppressWarnings - отключает предупреждения компилятора
class DataManager {
    @SuppressWarnings("unchecked")  // подавляем предупреждение о небезопасном приведении типа
    public List<String> getRawData() {
        return (List<String>) getLegacyData(); 
    }
    
    @SuppressWarnings({"rawtypes", "unused"})  // подавляем несколько предупреждений
    private Object getLegacyData() {
        List list = new ArrayList(); 
        return list;
    }
    
    public void process() {
        @SuppressWarnings("unused")  // можно применять к локальным переменным
        int temporaryValue = 42; // переменная не используется
    }
}