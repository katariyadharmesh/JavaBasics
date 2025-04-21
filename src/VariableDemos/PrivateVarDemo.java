package VariableDemos;

public class PrivateVarDemo
{
    private int privateVar = 10; // Private variable

    // Public getter method
    public int getPrivateVar()
    {
        return privateVar;
    }

    // Public setter method
    public void setPrivateVar(int value)
    {
        this.privateVar = value;
    }
}
 class PrivateVarAccessfromAnotherClass {
    public static void main(String[] args) {
        PrivateVarDemo obj = new PrivateVarDemo();
        // Access via getter
        System.out.println("PrivateVar value: " + obj.getPrivateVar()); // ✅ Works (Output: 10)

        // Modify via setter
        obj.setPrivateVar(20);
        System.out.println("Updated PrivateVar: " + obj.getPrivateVar()); // ✅ Output: 20
    }
}