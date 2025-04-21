package VariableDemos;

public class InstanceVariablesDemo
{
    public int publicInstanceVar; // Public instance variable
    private String privateInstanceVar;// Private instance variable
    protected double protectedInstanceVar; // Protected instance variable
    char packagePrivateInstanceVar; // Package-private (default) instance variable, if we no define any access modifier

    // Constructor
    public InstanceVariablesDemo(int publicVal, String privateVal, double protectedVal, char packageVal) {
        this.publicInstanceVar = publicVal;
        this.privateInstanceVar = privateVal;
        this.protectedInstanceVar = protectedVal;
        this.packagePrivateInstanceVar = packageVal;
    }

    public static void main(String[] args)
    {
        InstanceVariablesDemo demo = new InstanceVariablesDemo(100, "Private Data", 2.718, 'A');
        // Accessing instance variables
        System.out.println("Accessing instance variables:");
        System.out.println("publicInstanceVar: " + demo.publicInstanceVar);
        System.out.println("protectedInstanceVar: " + demo.protectedInstanceVar);
        System.out.println("packagePrivateInstanceVar: " + demo.packagePrivateInstanceVar);
        System.out.println("privateInstanceVar:" + demo.privateInstanceVar);
    }
}
