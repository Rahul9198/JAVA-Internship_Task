//2. WAP to convert Integer numbers and Binary numbers in java. 


import java.util.Scanner;

public class IntegerBinaryConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the integer number from the user
        System.out.println("Enter an integer number: ");
        int integerNumber = scanner.nextInt();

        // Convert the integer number to binary
        String binaryNumber = Integer.toBinaryString(integerNumber);

        // Print the binary number
        System.out.println("The binary equivalent of " + integerNumber + " is " + binaryNumber);

        // Get the binary number from the user
        System.out.println("Enter a binary number: ");
        String binaryString = scanner.next();

        // Convert the binary number to integer
        int integerNumber1 = Integer.parseInt(binaryString, 2);

        // Print the integer number
        System.out.println("The integer equivalent of " + binaryString + " is " + integerNumber1);
    }
}