package Constructor;
//Calling one constructor from another constructor in the same class using this().
public class ConstructorChaining {
        String name;
        int age;
        String address;

        // Constructor 1
        public ConstructorChaining() {
            this("Unknown"); // Calls Constructor 2
        }

        // Constructor 2
        public ConstructorChaining(String name) {
            this(name, 0); // Calls Constructor 3
        }

        // Constructor 3
        public ConstructorChaining(String name, int age) {
            this(name, age, "Not specified"); // Calls Constructor 4
        }

        // Constructor 4
        public ConstructorChaining(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
        }

        public static void main(String[] args) {
            ConstructorChaining p1 = new ConstructorChaining();
            ConstructorChaining p2 = new ConstructorChaining("Alice");
            ConstructorChaining p3 = new ConstructorChaining("Bob", 25);
            ConstructorChaining p4 = new ConstructorChaining("Charlie", 30, "123 Main St");

            p1.display();
            p2.display();
            p3.display();
            p4.display();
        }
    }

