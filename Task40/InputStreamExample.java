import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        // Создаем строку и преобразуем в массив байт
        byte[] bytes = "Hello World".getBytes();
        
        // ByteArrayInputStream - подкласс InputStream
        try (InputStream input = new ByteArrayInputStream(bytes)) {
            int data;
            System.out.print("bytes read: ");
            
            // read() читает один байт, возвращает -1 в конце
            while ((data = input.read()) != -1) {
                System.out.print((char) data + "(" + data + ") ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}