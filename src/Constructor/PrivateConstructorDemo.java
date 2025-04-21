package Constructor;
//A private constructor is a constructor that can only be accessed within the class itself.
//This means no other class can create an object of this class directly using the new keyword.
//in this, we will access private constructor from another class from Singleton pattern.
public class PrivateConstructorDemo
{
    private static PrivateConstructorDemo instance;
    private PrivateConstructorDemo()
    {
        System.out.println("Private Constructor calling");
    }
    public static PrivateConstructorDemo getInstance()
    {
        if (instance == null) {
            instance = new PrivateConstructorDemo(); // Create instance only if it doesn't exist
        }
        return instance;
    }
}

class PrivateConstructorcallingDemo
{
    public static void main(String[] args)
    {
        PrivateConstructorDemo pcd = PrivateConstructorDemo.getInstance(); // ✔️ Allowed Private constructor access
        PrivateConstructorDemo pcd1 = PrivateConstructorDemo.getInstance(); // Same instance
    }
}
