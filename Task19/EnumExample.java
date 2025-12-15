public class EnumExample {
    
    // Перечисление статусов заказа
    public enum OrderStatus {
        NEW("new", 1),
        PROCESSING("processing", 2),
        SHIPPED("shipped", 3),
        DELIVERED("delivered", 4),
        CANCELLED("cancelled", 0);
        
        private final String description;
        private final int priority;
        
        OrderStatus(String description, int priority) {
            this.description = description;
            this.priority = priority;
        }
        
        public String getDescription() {
            return description;
        }
        
        public int getPriority() {
            return priority;
        }
        
        // Метод проверки можно ли отменить заказ
        public boolean canCancel() {
            return this != DELIVERED && this != CANCELLED;
        }
        
        // Получение следующего статуса
        public OrderStatus next() {
            switch(this) {
                case NEW: return PROCESSING;
                case PROCESSING: return SHIPPED;
                case SHIPPED: return DELIVERED;
                default: return this;
            }
        }
    }
    
    public static void main(String[] args) {
        // Проход по всем значениям
        for (OrderStatus status : OrderStatus.values()) {
            System.out.printf("%s: %s (priority: %d)%n", 
                status, 
                status.getDescription(), 
                status.getPriority());
            
            // Использование дополнительного метода
            System.out.println("  can be cancelled? " + (status.canCancel() ? "yes" : "no"));
        }
        
        OrderStatus current = OrderStatus.NEW;
        System.out.println("initial status: " + current.getDescription());
        
        current = current.next();
        System.out.println("after processing: " + current.getDescription());
        
        current = current.next();
        System.out.println("after shipping: " + current.getDescription());
        
        current = current.next();
        System.out.println("final status: " + current.getDescription());
    }
}