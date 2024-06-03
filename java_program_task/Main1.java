//2. Create a class named Rectangle with attributes length and breadth (or width) and methods to calculate and display the area. Use the Scanner class to get user input for the rectangle's dimensions. (Area of Rectangle = Length*Breadth) 


import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Area of the rectangle: " + calculateArea());
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.displayArea();

        scanner.close();
    }
}
