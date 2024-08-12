import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
        //int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
    
}
