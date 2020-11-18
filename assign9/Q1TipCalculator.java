package daily_assignments.assign9;

import java.util.Scanner;

public class Q1TipCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("split or no split? true or false");
		boolean isSplit=input.nextBoolean();
		
		System.out.println("How many people?");
		int numberOfPeople=input.nextInt();
		
		System.out.println("total amount?");
		double totalAmount=input.nextDouble();
		
		System.out.println("service quality: poor, fair, good, great, excellent ");
		String serviceQuality=input.next();
		
		tipCalculator(isSplit,numberOfPeople,totalAmount, serviceQuality);
		

	}

	public static void tipCalculator(boolean isSplit,int numberOfPeople,double totalAmount, String serviceQuality) {
		System.out.print("Number of people entered: ");
		for(int i=1; i<=numberOfPeople; i++) {
		System.out.print("&");
		}System.out.println();
		System.out.println("total to pay: " + totalAmount);
		double tip=1;
		switch(serviceQuality) {
			case "poor":
				tip=totalAmount*0.05;
				break;
			case "fair":
				tip=totalAmount*0.10;
				break;
			case "good":
				tip=totalAmount*0.15;
				break;
			case "great":
				tip=totalAmount*0.20;
				break;
			case "excellent":
				tip=totalAmount*0.25;
				break;
			default:
				System.out.println("Sorry, unknown assesment!");				
		
		}System.out.println("total tip: " + tip);
		System.out.println("total per person: "+ (totalAmount+tip)/numberOfPeople);
		System.out.println("tip per person: "+ (tip/numberOfPeople));
	}
}
