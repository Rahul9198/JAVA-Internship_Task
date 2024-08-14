import java.util.Scanner;

public class NestedIfElse {
    public static void main(String [] args) {
        int marksObtained, passingMarks;
        char grade;
        passingMarks=40;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks obtained");
        marksObtained = input.nextInt();
        if(marksObtained>=passingMarks){
            if(marksObtained>=90){
                grade = 'A';
            }
            else if(marksObtained>=80 && marksObtained<90){
                grade = 'B';
            }
            else if(marksObtained>=70 && marksObtained<80){
                grade = 'C';
            }
            else if(marksObtained>=60 && marksObtained<70){
                grade = 'D';
            }
            else{
                grade = 'F';
            }
            System.out.println("Your grade is "+grade);
        }
        else{
            System.out.println("You have failed");
        }
        input.close();
    }
    
}
