package dailyassignments_Lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {


		System.out.println("Enter one positive number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum=sum+i;
		}
		System.out.println("sum of your numbers from zero is: " +sum);
	}

}
