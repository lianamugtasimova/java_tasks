// Интерфейсы верхнего уровня не могут быть private

/*
private interface Interface4 {
    void method4();
}
это взовет ошибку компиляции
*/

// Правильное использование private - только для вложенных интерфейсов
class OuterClass4 {
    // Вложенный интерфейс МОЖЕТ быть private
    private interface Interface {
        void method();
    }
    
    // Внутренний класс реализует private интерфейс
    private class InnerClass implements Interface {
        public void method() {
            System.out.println("private interface");
        }
    }
}