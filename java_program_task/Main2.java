//3. Create a class named Circle with an attribute radius and a method to calculate the area. Use Scanner to get user input for the circle's radius (Area of Circle = πr*r)

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        double area = circle.calculateArea();

        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}
