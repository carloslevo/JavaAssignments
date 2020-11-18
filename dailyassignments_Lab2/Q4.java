package dailyassignments_Lab2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		System.out.println("enter how many males in your class");
		Scanner scan=new Scanner (System.in);
		int male=scan.nextInt();
		
		System.out.println("enter how many females in your class");
		int female=scan.nextInt();
		
		int percMale= male*100/(male+female);
		int percFemale=female*100/(male+female);
		
		System.out.println("Percantageof male at your class is: %"+percMale);
		System.out.println("Percantageof male at your class is: %"+percFemale);

	}

}
