import java.util.Scanner;

public class IfElse {
    public static void main(String [] args) {
        int marksObtained, passingMarks;
        passingMarks=40;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks obtained");
        marksObtained = input.nextInt();
        if(marksObtained>=passingMarks){
            System.out.println("You have passed");
        }
        else{
            System.out.println("You have failed");
        }
        input.close();
    }
    
}
