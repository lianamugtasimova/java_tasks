public class ExceptionClassesPurpose {
    public static void main(String[] args) {
        /*
        Throwable - базовый класс всех исключений и ошибок
        
        Error - непроверяемые критические ошибки которые не должны перехватываться:
        - OutOfMemoryError - нехватка памяти
        - StackOverflowError переполнение стека
        - VirtualMachineError сбой JVM
        
        Exception - базовый класс всех проверяемых исключений
        
        RuntimeException - непроверяемые исключения времени выполнения:
        - ArithmeticException - деление на ноль
        - NullPointerException - обращение к null
        - IndexOutOfBoundsException выход за границы массива
        
        Проверяемые исключения (не RuntimeException):
        - IOException ошибки ввода или авывод
        - SQLException ошиби базы данных
        - ClassNotFoundException класс не найден
        */
    }
}