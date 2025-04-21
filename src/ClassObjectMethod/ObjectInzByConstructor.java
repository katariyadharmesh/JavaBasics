package ClassObjectMethod;

public class ObjectInzByConstructor {
    String name;
    int age;

    // Constructor (initializes object on creation)
    public ObjectInzByConstructor(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    public void display()
    {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
    }
    public static void main(String[] args) {
        // Initialize object during creation
        ObjectInzByConstructor Objcon = new ObjectInzByConstructor("Alice", 20);//once the object create, constructor will auto called.
        Objcon.display();
    }
}




