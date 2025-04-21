package DataTypesDemos;
//Primitive types are the most basic data types in Java and are not objects.
public class PrimitiveTypes
{
    public static void main(String[] args)
    {
        // Integer types
        byte myByte = 127;  // 8-bit (-128 to 127)
        short myShort = 32767;  // 16-bit (-32,768 to 32,767)
        int myInt = 2147483647;  // 32-bit (-2^31 to 2^31-1)
        long myLong = 9223372036854775807L;  // 64-bit (-2^63 to 2^63-1)

        // Floating-point types
        float myFloat = 3.4028235e38f;  // 32-bit (approx ±3.4e38)
        double myDouble = 1.7976931348623157e308;  // 64-bit (approx ±1.7e308)

        // Character type
        char myChar = 'A';  // 16-bit Unicode (0 to 65,535)

        // Boolean type
        boolean myBoolean = true;  // true or false

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
    }
}
