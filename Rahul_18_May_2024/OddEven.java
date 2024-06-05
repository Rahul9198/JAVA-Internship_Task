import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        if(n%2==0)
        {
            System.out.println("The number is Even");
        }
       else{
        System.out.println("The number is Odd");
       }

    }
}
