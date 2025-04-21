package Constructor;
//Constructor Overloading in Java means having multiple constructors in the same class with different parameter lists
public class ConstructorOverloadingDemo
{

        int length;
        int width;

        // Default constructor
        public ConstructorOverloadingDemo() {
            this.length = 0;
            this.width = 0;
        }

        // Constructor with one parameter (square)
        public ConstructorOverloadingDemo(int side) {
            this.length = side;
            this.width = side;
        }

        // Constructor with two parameters
        public ConstructorOverloadingDemo(int length, int width) {
            this.length = length;
            this.width = width;
        }
        public int calculateArea() {
            return length * width;
        }

        public static void main(String[] args) {
            ConstructorOverloadingDemo cod1 = new ConstructorOverloadingDemo(); // Default
            ConstructorOverloadingDemo cod2 = new ConstructorOverloadingDemo(5); // Square
            ConstructorOverloadingDemo cod3 = new ConstructorOverloadingDemo(4, 6); // Rectangle

            System.out.println("Area1: " + cod1.calculateArea());
            System.out.println("Area2: " + cod2.calculateArea());
            System.out.println("Area3: " + cod3.calculateArea());
        }

}
