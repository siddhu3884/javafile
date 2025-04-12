class Car {
    String model;
    int year;

    void display() {
        System.out.println(model + " " + year);
    }
}

public class objclass {
    public static void main(String[] args) {
        Car car1 = new Car();  // Creating an object of the Car class
        car1.model = "Toyota";
        car1.year = 2022;
        car1.display();  // Output: Toyota 2022
    }
} 