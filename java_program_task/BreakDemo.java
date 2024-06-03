import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter 5 name");
        System.out.println("Warnign!!! do not enter the \"abc\"");
        String names[]= new String[5];
        Scanner s = new Scanner(System.in);
        int i;
        for(i = 0;i <5;i++){
            String name = s.nextLine();
            if(name.equals("abc")){
                System.out.println("You  foo.. I told you not to Enter abc");
                Thread.sleep(2000);
                System.out.println("System is crashing...");
                Thread.sleep(2000);
                break;

            }
            names[i]=name;
        }
        if(i==5)
        {
            System.out.println("The names you have entered are...");
            System.out.println("*********");
            for(int j=0;j<5;j++)
            {
                System.out.println(names[j]);
            }
            System.out.println("**********");
        }


    }
    
}
