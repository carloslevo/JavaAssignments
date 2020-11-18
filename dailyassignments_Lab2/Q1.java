package dailyassignments_Lab2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int min=100000;
		int max=0;
		for(int i=0; i<3;i++) {
		System.out.println("enter numbers");
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		if(y<min) {
			min=y;
		
		}else if(y>max){
			max=y;
		}
		}
		
			System.out.println("Smaller number is: "+min);
			System.out.println("Bigger number is: "+max);
		
		
		
	}

}
