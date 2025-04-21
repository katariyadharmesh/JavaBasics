package Constructor;

/*Key Points About Constructors:
1.Constructor name must be same as the class name
2.Constructors don't have a return type (not even void)
3.A class can have multiple constructors (overloading)
4.If no constructor is defined, Java provides a default constructor
5.Constructors can be public, private, protected or default (no modifier)
6.Constructors are called only once when an object is created
7.Constructors cannot be abstract, final, static or synchronized*/
public class ConstructorDemo
{
    int age;
    String name;
    ConstructorDemo()
    {
        System.out.println("No Argument Constructor Calling");
    }
    ConstructorDemo(String name, int age)
    {
        this.age = age;
        this.name = name;
        System.out.println("Argument Constructor Called --> "+ "name is " + name + " & " +"Age is : " + age);
    }

    public static void main(String[] args) {
        new ConstructorDemo();
        new ConstructorDemo("Ayush", 10);
    }
}
