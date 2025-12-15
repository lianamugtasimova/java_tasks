interface DataFormatter {
    // неабстрактный метод
    default String format(String data) {
        return "Formatted: " + data.toUpperCase();
    }
    
    // статический метод
    static String createTimestamp() {
        return "TS_" + System.currentTimeMillis();
    }
}

// Класс, реализующий интерфейс
class ReportGenerator implements DataFormatter {
    @Override
    public String format(String data) {
        return "Report: " + data;
    }
}

class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        
        // Вызов неабтраткного метода через объект класса
        System.out.println(generator.format("data")); 
        
        // Вызов статического метода через интерфейс
        String timestamp = DataFormatter.createTimestamp();
        System.out.println(timestamp);
        
        // Вызов унаследованной реализации 
        DataFormatter formatter = new DataFormatter() {};
        System.out.println(formatter.format("test")); // "Formatted: TEST"
    }
}