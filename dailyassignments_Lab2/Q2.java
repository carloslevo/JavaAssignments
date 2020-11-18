package dailyassignments_Lab2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		double bagNum=40.0;
		double calories=0;
		System.out.println("How many cookies did you eat?");
		Scanner scan = new Scanner(System.in);
		bagNum=scan.nextInt();
		
		calories= (bagNum/10)*300;
		System.out.println("Total calories you consumed: "+calories);
	}

}
