package ClassObjectMethod;

public class ObjectInzByRefVar
{
    /*instance variable is a variable that is defined within a class but outside of any method, constructor, or block*/
    int age;
    String name;

    void display()
    {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        ObjectInzByRefVar obj = new ObjectInzByRefVar();
        obj.age = 18;
        obj.name = "Dharmesh";
        obj.display();

    }
}
