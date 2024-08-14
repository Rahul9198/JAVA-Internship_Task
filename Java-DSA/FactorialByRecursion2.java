import java.util.Scanner;

public class FactorialByRecursion2 {

    int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        FactorialByRecursion2 obj = new FactorialByRecursion2();
        obj.factorial(n);
        System.out.println(obj.fact);
        sc.close();
    }

    public void factorial(int n) {
        if (n == 0) {
            return ;
        }
        factorial(n - 1);
        fact = fact * n;
    }
      
    
}
