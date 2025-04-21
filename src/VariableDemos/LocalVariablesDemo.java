package VariableDemos;
//Local variables are declared inside methods, constructors, or blocks.
//Local variables cannot have access modifiers in Java.
//They are only accessible within that block, so access modifiers like public, private, or protected are not allowed or needed.
public class LocalVariablesDemo
{
    // Method demonstrating local variables
    public void demonstrateLocalVariables() {
        // Local variables (no access modifiers allowed)
        int localInt = 42;
        String localString = "I'm local";
        final double LOCAL_CONSTANT = 9.8; // final local variable

        System.out.println("Local variables inside method--->");
        System.out.println("localInt: " + localInt);
        System.out.println("localString: " + localString);
        System.out.println("LOCAL_CONSTANT: " + LOCAL_CONSTANT);
    }

    public static void main(String[] args) {
        LocalVariablesDemo Ldemo = new LocalVariablesDemo();
        Ldemo.demonstrateLocalVariables();
    }

}
