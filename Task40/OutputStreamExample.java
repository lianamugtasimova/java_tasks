import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        // ByteArrayOutputStream - подкласс OutputStream
        try (OutputStream output = new ByteArrayOutputStream()) {
            // Записываем отдельные байты
            output.write('H');  // 72
            output.write('e');  // 101
            output.write('l');  // 108
            output.write('l');  // 108
            output.write('o');  // 111
            
            ByteArrayOutputStream baos = (ByteArrayOutputStream) output;
            System.out.println("written: " + baos.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}