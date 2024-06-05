//java program to add tow numbers with user input

import java.util.Scanner;

public class add2 {
    public static void main(String []args){
        int a,b;
        System.out.println("Enter the first number:-");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the second number:-");
        b=obj.nextInt();
        System.out.println("The sum of two numbers is:- "+(a+b));
        System.out.println("Hurrah! we can do it.");

    }
}
