package ClassObjectMethod;

public class MethodDemo2
{
    public static void main(String[] args) {
        MethodDemo md1 = new MethodDemo();
        md1.protectedMethod();
        md1.finalMethod();
        md1.defaultAccessMethod();
        md1.synchronizedMethod();
        md1.publicInstanceMethod();
        MethodDemo.publicStaticMethod();
    }
}
