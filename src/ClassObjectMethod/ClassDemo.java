package ClassObjectMethod;/*In Java, you can only have one public class per source file, and the name of the public class must match the
 name of the file.*/
/*Class - A blueprint for creating objects (e.g., Car, Person).
Object - An instance of a class (e.g., myCar, john).*/

public class ClassDemo
{
    /*A method in Java is a set of instructions that can be called for execution using the method name*/
    public void eat()
    {
        System.out.println("eat method running");
    }
    public void run()
    {
        System.out.println("run method running");
    }
    public static void main(String[] args)
    {
        System.out.println("Program Start from here");
        ClassDemo cd = new ClassDemo();
        cd.eat();
        cd.run();
        AnotherClassDemo acd = new AnotherClassDemo();
        acd.write();
    }
}
class AnotherClassDemo
{
    public void write()
    {
        System.out.println("write method running");
    }
}
