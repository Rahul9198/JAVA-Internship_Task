import java.util.Scanner;

public class UserInput {

    public static void main(String[] args)
    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);


        System.out.println("Enter your marks");
        float marks = sc.nextFloat();
        System.out.println("Your marks are " + marks);

        System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Your city is " + city);

        System.out.println("Enter your Gender");
        char gender = sc.next().charAt(0);
        System.out.println("Your Gender is " + gender);
        sc.close();


    }
    
}
