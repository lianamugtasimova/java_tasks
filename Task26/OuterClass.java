public class OuterClass {
    // доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner: accessible everywhere");
        }
    }
    
    // доступен только в OuterClass
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner: only inside OuterClass");
        }
    }
    
    // доступе наследникам
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner: package and subclasses");
        }
    }
    
    // 
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner: only in same package");
        }
    }
    
    public void testAccess() {
        // Все внутренние классы доступны внутри OuterClass
        PublicInner pi = new PublicInner();
        PrivateInner pri = new PrivateInner();
        ProtectedInner pro = new ProtectedInner();
        DefaultInner di = new DefaultInner();
        
        pi.show();
        pri.show();
        pro.show();
        di.show();
    }
}

class TestInSamePackage {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // Только public, protected и default доступны
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        OuterClass.DefaultInner defaultInner = outer.new DefaultInner();
        // Private недоступен
    }
}

// Наследник OuterClass
class SubClass extends OuterClass {
    void test() {
        // В наследнике доступны public и protected
        PublicInner pi = new PublicInner();
        ProtectedInner pro = new ProtectedInner();
    }
}