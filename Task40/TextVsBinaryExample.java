// Reader/Writer предназначены для работы с текстом а InputStream/OutputStream - для работы с бинарными данными

public class TextVsBinaryExample {
    public static void main(String[] args) {
        // Пример проблемы с кодировкой:
        String text = "hello world"; // Unicode текст
        byte[] bytes = text.getBytes(); // Преобразуется в байты
        
        // При использовании InputStream/OutputStream:
        // Нужно вручную управлять кодировкой
        // Символы могут занимать разное количество байт
        // Сложно читать строки целиком
        
        // Reader/Writer решают эти проблемы:
        // - Автоматически работают с Unicode
        // - Читают b пишут символы, а не байты
        // - Имеют удобные методы для работы с текстом 
    }
}