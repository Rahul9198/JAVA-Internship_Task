package ATMMachine;
import java.util.*;


class ATM{
	double Balance;
	int PIN=5678;
	
	public void checkpin() {
		System.out.println("Enter your pin:");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if(enteredpin==PIN) {
			menu();
			
		}
		else {
			System.out.println("Enter a vaild pin");
			menu();
		}
		
	}
	public void menu() {
		System.out.println("Enter YOur Choice");
		System.out.println("1. check A/C Balence");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. EXIT");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		 
		if(opt == 1){
			checkBalance();	
		}
		else if(opt == 2) {
			withdrawMoney();
			
		}
		else if(opt == 3) {
			DepositeMoney();
			
		}
		else if(opt == 4) {
			return;
		
		}
		else {
			System.out.println("enter a valid Choice");
			
			
		}	
		
	}
	public void checkBalance() {
		System.out.println("Balance"+Balance);
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter Amount to withdraw");
		Scanner sc= new Scanner(System.in);
		float amount = sc .nextFloat();
		if(amount>Balance) {
			System.out.println("Insuffiennt Banance");
			
		}
		else {
			Balance = Balance-amount;
			System.out.println("Money withdraw successfully");
			
		}
		menu();
	}
	public void DepositeMoney() {
		System.out.println("Enter the Amount:");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited successfully");
		menu();
		
		
		
	}
	
}




public class ATMMachine {
	public static void main(String[] args) {
		ATM obj= new ATM();
		obj.checkpin();
		 
		
		
	}

}