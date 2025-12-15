import java.util.Date;

public class TimeFormat{
    public static void main(String[] args) {
        Date now = new Date();
        
        // %tY - год в четырехзначном формате
        // %tm - месяц в двузначном формате
        // %td - день месяца
        System.out.printf("Date: %tY-%tm-%td%n", now, now, now);
        
        // %tH - час (00-23)
        // %tM - минуты
        // %tS - секунды
        System.out.printf("Time: %tH:%tM:%tS%n", now, now, now);
        
        // %tA - полное название дня недели
        System.out.printf("day of a week: %tA%n", now);
        
        // %tB - полное название месяца
        System.out.printf("month: %tB%n", now);
        
        // %tI - час в 12-часовом формате
        System.out.printf("hour: %tI:%tM %Tp%n", now, now, now);
    }
}