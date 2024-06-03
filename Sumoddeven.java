/*Print sum of Odd or Even in  Given Range*/

import java.util.Scanner;

public class Sumoddeven {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter any number::");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0f)
        {
            for(int i=0;i<=n;i++){
                sum=sum+i;

            }
            System.out.println("sum of even number:"+sum);

        }
        else{
            for(int i=0;i<=n;i=i+2){
                sum=sum+i;

            }
            System.out.println("sum of odd number:"+sum);

        }     
}
}