package ClassObjectMethod;

public class ObjectInzByMethod
{
    int age;
    String name;
    // Method to initialize object fields
    public void initObj(int age1, String name1)
    {
        age = age1;
        name = name1;
    }
    // Method to display details
    public void display()
    {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args)
    {
        // Step 1: Create object
        ObjectInzByMethod obj = new ObjectInzByMethod();
        // Step 2: Initialize object using method
        obj.initObj(25,"Dharmesh");//The initObj() method sets the object's fields (name and age).
        // Step 3: Display details
        obj.display();

    }
}
