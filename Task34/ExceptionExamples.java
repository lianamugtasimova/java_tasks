public class ExceptionExamples {
    public static void main(String[] args) {
        // ArithmeticException - деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        
        //ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException"+ e.getMessage());
        }
        
        //IllegalArgumentException - недопустимый аргумент
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        
        //ClassCastException - неправильное приведение типов
        try {
            Object obj = "строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException" + e.getMessage());
        }
        
        //NullPointerException - обращение к null
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }
    }
    
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("cant be negative");
        }
    }
}