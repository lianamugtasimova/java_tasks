public class EnumInitialization {
    
    // Перечисление с инициализацией полей
    public enum Planet {
        // Конструктор вызывается для каждой константы
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6),
        JUPITER(1.9e+27, 7.1492e7),
        SATURN(5.688e+26, 6.0268e7),
        URANUS(8.686e+25, 2.5559e7),
        NEPTUNE(1.024e+26, 2.4746e7);
        
        // Поля перечисления
        private final double mass;   // в килограммах
        private final double radius; // в метрах
        
        // Конструктор (автоматически private)
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }
        
        // Методы доступа
        public double getMass() {
            return mass;
        }
        
        public double getRadius() {
            return radius;
        }
        
        // Вычисляемое свойство
        public double getSurfaceGravity() {
            final double G = 6.67300E-11;
            return G * mass / (radius * radius);
        }
        
        // Еще одно вычисляемое свойство
        public double getSurfaceWeight(double otherMass) {
            return otherMass * getSurfaceGravity();
        }
    }
    
    public static void main(String[] args) {
        // Используем инициализированные значения
        for (Planet p : Planet.values()) {
            System.out.printf("%s: mass = %.2e kg, radius = %.2e m%n", 
                p, p.getMass(), p.getRadius());
        }
        
        double earthWeight = 70; // кг на Земле
        System.out.printf("Weight on Earth: %.1f kg%n", earthWeight);
        
        for (Planet p : Planet.values()) {
            double weightOnPlanet = p.getSurfaceWeight(earthWeight);
            System.out.printf("Weight on %s: %.1f kg%n", p, weightOnPlanet);
        }
    }
}