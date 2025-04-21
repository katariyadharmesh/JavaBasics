package ClassObjectMethod;

public class ObjectDemo
{
    int age;
    String name;

    public void show()
    {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args)
    {
        ObjectDemo obj1 = new ObjectDemo(); //obj1 is a reference variable pointing to a new ObjectDemo object.
        obj1.age=15;
        obj1.name="John";
        obj1.show();
    }
}

/*Reference Variable (obj1) → Holds the memory address of an object.
new Keyword → Allocates memory for the object.
Dot (.) Operator → Accesses object members (variables/methods).*/

/*Myth: "student1 is the object."
Truth: "student1 refers to the object."*/

/*Reference Variable = Pointer to an object.
Object = Actual instance in memory.*/
