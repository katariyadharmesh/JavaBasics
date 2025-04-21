package ClassObjectMethod;

public class MethodDemo {

    // Instance variable
    private int instanceVar = 10;

    // Static variable
    private static int staticVar = 20;

    // 1. Instance Method (public access)
    public void publicInstanceMethod() {
        System.out.println("Public instance method called. Instance var: " + instanceVar);
    }

    // 2. Instance Method (private access)
    private void privateInstanceMethod() {
        System.out.println("Private instance method called");
    }

    // 3. Static Method (public access)
    public static void publicStaticMethod() {
        System.out.println("Public static method called. Static var: " + staticVar);
    }

    // 4. Static Method (private access)
    private static void privateStaticMethod() {
        System.out.println("Private static method called");
    }

    // 5. Final Method (cannot be overridden)
    public final void finalMethod() {
        System.out.println("Final method called");
    }

    // 6. Abstract Method (must be in abstract class)
    // public abstract void abstractMethod(); // Uncomment in abstract class

    // 7. Synchronized Method (thread-safe)
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized method called");
    }

    // 9. Method with default (package-private) access
    void defaultAccessMethod() {
        System.out.println("Default access method called");
    }

    // 10. Protected Method
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    // Constructor (special type of method)
    public MethodDemo() {
        System.out.println("Constructor called");
    }

    // Main method to test all these methods
    public static void main(String[] args) {
        // Create an instance of MethodDemo
        MethodDemo demo = new MethodDemo();

        // Call instance methods
        demo.publicInstanceMethod();
        demo.privateInstanceMethod(); // Accessible here because we're in the same class
        demo.finalMethod();
        demo.synchronizedMethod();
        demo.defaultAccessMethod();
        demo.protectedMethod();

        // Call static methods
        publicStaticMethod();
        privateStaticMethod(); // Accessible here because we're in the same class
        System.out.println(MethodDemo.staticVar);

        SubClass sc1 = new SubClass();
        System.out.println("---------------------------------------");
        sc1.publicInstanceMethod();
        sc1.protectedMethod();
        sc1.defaultAccessMethod();
        sc1.finalMethod();
        sc1.synchronizedMethod();
        publicStaticMethod();
        privateStaticMethod();
    }
}

// Subclass to demonstrate protected access
class SubClass extends MethodDemo {
    void testProtectedAccess() {
        protectedMethod(); // Can access protected method from superclass
        // privateInstanceMethod(); // Would cause error - private not accessible
    }
}
