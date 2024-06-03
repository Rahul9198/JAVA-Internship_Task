
import java.util.Scanner;
public class Uinput {

    
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Enter Numbre");
        int number = a.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(number*i);
        }
        // System.out.println("Enter phone Height:");
        // long phone = a.nextLong();
        // System.out.println("your phone No is"+phone);

        // double Phone = a.nextDouble();
        // System.out.println("your phone No :"+Phone);
        // byte age =a.nextByte();
        // System.out.println("your age is :"+age);
        // System.out.println("DO you have a laptop");
        // boolean laptop = a.nextBoolean();
        // if (laptop) {
        //     System.out.println("you have a laptop");
        // }
        // else{
        //     System.out.println("you do not have a laptop");
        // }

       
        // System.out.println("Enter your age::");
        // System.out.println("Enter you name:");
        // Scanner obj = new Scanner(System.in);
        // // int a = obj.nextInt();
        // String name = obj.nextLine();

        // // System.out.println("Your name is:"+a);
        // System.out.println("Enter password");
        // String pass = obj.nextLine();
        // // System.out.println("Your password is:"+b);
        // if(name.equals("Rahul") && pass.equals("12345")){
        //     if(pass.equals("admin"))
        //     System.out.println("authorised user");
        // }
        // else{
        //     System.out.println("Loggitng Out");

        // }
        // // if (age>=18){
        // //     System.out.println("you can vote");

        // }
        // else{
        //     System.out.println("you cannot vote");

        // }
        
    }
}