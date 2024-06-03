import java.util.Scanner;

public class add {
    public static void main(String args[])
    {
        int a,b,sum;
        System.out.println("Enter two number::");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum of two number is ::"+sum);
    }

}
