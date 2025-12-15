// Интерфейсы не могут быть объявлены как protected
/*
protected interface Interface3 {
    void method3();
}
это взовет ошибку компиляции
*/

// Правильное использование protected - только для вложенных интерфейсов
class OuterClass3 {
    // Вложенный интерфейс может быть protected
    protected interface Interface {
        void method();
    }
}
