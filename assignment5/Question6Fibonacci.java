package daily_assignments.assignment5;
import java.util.*;
public class Question6Fibonacci {

	public static void main(String[] args) {

		int first=0;
		int second=1;
		int third;
		//int n=10;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your iteration number for fibonacci series");
		int n=input.nextInt();
		
		
		//
		if(n<=1) {
			System.out.print(first);
		}
			else if(n>=2) {
				System.out.print(first+","+second);
			}else {
			System.out.print(first+","+second);
			
		}
		for(int k=0;k<n-2; k++) {
								
				third=first+second;
				first=second;
				second=third;
				System.out.print(","+third);
						
				
				
		}
		
	
		
	
	
	

	}

}
