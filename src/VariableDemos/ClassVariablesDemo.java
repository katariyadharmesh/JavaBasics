package VariableDemos;
//in Java, static variables and class variables are the same thing.
//A static variable is declared using the static keyword inside a class but outside any method or constructor.
//It is also called a class variable because it belongs to the class itself, not any specific object.
//Useful for common properties (like constants, counters, configuration).
public class ClassVariablesDemo
{
    // Public static (class) variable
    public static int publicStaticVar = 10;

    // Private static (class) variable
    private static String privateStaticVar = "Class Info";

    // Protected static (class) variable
    protected static double protectedStaticVar = 3.14;

    // Package-private (default) static variable
    static boolean packagePrivateStaticVar = true;

    public static void main(String[] args)
    {

        System.out.println(publicStaticVar); // ✅ Direct access
        System.out.println(packagePrivateStaticVar); // ✅ Class name (optional here)
        System.out.println(protectedStaticVar);
        System.out.println(privateStaticVar);
    }

}
