// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();  // create object of Dog
        d.eat();            // call inherited method
        d.bark();           // call Dog's own method
    }
}