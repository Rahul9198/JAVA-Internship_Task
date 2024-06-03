// 5. Create a class to find out the distance b/w two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).

import java.util.Scanner;

class DistanceCalculator {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x-coordinate of first point: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y-coordinate of first point: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x-coordinate of second point: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y-coordinate of second point: ");
        double y2 = scanner.nextDouble();

        double distance = DistanceCalculator.calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the points: " + distance);

        scanner.close();
    }
}
