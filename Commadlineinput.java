import java.lang.System;
public class Commadlineinput {
    public static void main(String []args){
        //Scanner sc = new Scanner(System.in);
        if(args.length==2)
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int s= a+b;
            System.out.println("Sum is "+s);
            System.out.println("Finnely done it");

        }
        else
        System.out.println("wrong number of arguments");

    }
}
