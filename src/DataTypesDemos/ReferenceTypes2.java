package DataTypesDemos;
// Class object
class Person {
    String name;
    int age;
}

public class ReferenceTypes2 {
    public static void main(String[] args)
    {
        //Person is the non-primitive (reference) data type.
        //It’s a user-defined class—which means Person itself becomes a new data type.
        Person p = new Person();
        p.name = "Dhiyansh";
        p.age = 5;
        System.out.println(p.name + " is " + p.age + " years old.");
    }
}
