

import java.util.Scanner;

class condition_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		System.out.println("Enter Your marks::");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>=60 && marks<100)
		{
			System.out.println("First Division");
		}
		else if(marks>=45 && marks<60)
		{
			System.out.println("Second Division");	
		}
		else if(marks>=33 && marks<45)
		{
			System.out.println("third division");
			
		}
		else {
			System.out.println("Your are failed");
		}
			
		
		
			

	}

}
