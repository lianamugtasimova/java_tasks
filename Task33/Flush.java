import java.io.*;

public class Flush {
    public static void main(String[] args) throws IOException {
        // Без flush() данные могут не записаться сразу
        FileWriter writer = new FileWriter("test.txt");
        writer.write("First\n");
        // writer.flush(); // если не вызвать, данные в буфере
        
        writer.write("Second\n");
        writer.close(); // close() автоматически вызывает flush()
        
        // BufferedWriter пример
        BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt"));
        bw.write("Data in buffer");
        bw.flush(); // Принудительная запись из буфера в файл
        bw.write("\nmore data");
        bw.close();
    }
}