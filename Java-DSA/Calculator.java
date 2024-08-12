import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First numbers");
        int a = sc.nextInt();
        System.out.println("Enter Second numbers");
        int b = sc.nextInt();

        System.out.println("Enter your choice(1-add,2-sub,3-mul,4-div)");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                int sum = a+b;
                System.out.println(sum);
                break;
            }
            case 2:
            {
                int sub = a-b;
                System.out.println(sub);
                break;
            }
            case 3:
            {
                int mul = a*b;
                System.out.println(mul);
                break;
            }
            case 4:
            {
                int div = a/b;
                System.out.println(div);
                break;
            }
        }

        
       sc.close();
    }
    
}
