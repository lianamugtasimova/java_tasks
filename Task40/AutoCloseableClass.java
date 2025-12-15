// AutoCloseable позволяет использовать try-with-resources
class Resource implements AutoCloseable {
    public void use() {
        System.out.println("Using resource");
    }
    
    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}

public class AutoCloseableClass {
    public static void main(String[] args) {
        // Ресурс закроется автоматически
        try (Resource res = new Resource()) {
            res.use();
        }
    }
}