// Пользовательское исключение
class ValidationException extends Exception {
    
    // Конструктор по умолчанию
    public ValidationException() {
        super("Validation failed");
    }
    
    // Конструктор с сообщением
    public ValidationException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной
    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Пример использования
public class CustomException {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    static void validateAge(int age) throws ValidationException {
        if (age < 18) {
            throw new ValidationException("must be 18+");
        }
        System.out.println("Success");
    }
}
