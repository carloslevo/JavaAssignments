package dailyassignments_Lab2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		System.out.println("enter how many you charged");
		Scanner scan=new Scanner (System.in);
		double charge=scan.nextDouble();
		
		double tax=charge*6.75/100;
		double price= charge+tax;
		double tip=price*0.2;
		double total=price+tip;
		
		System.out.println("meal charge is : " +charge);
		System.out.println("total tax is : " +tax);
		System.out.println("tip is : " +tip);
		System.out.println("total pay is : " +total);
	}

}
