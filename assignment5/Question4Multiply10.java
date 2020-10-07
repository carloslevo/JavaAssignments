package daily_assignments.assignment5;
import java.util.*;
public class Question4Multiply10 {

	public static void main(String[] args) {


		int product=200;
		int k;
		Scanner input=new Scanner(System.in);
		
		
			while (product>100) {
				System.out.println("Enter your number");
				int number=input.nextInt();
				product=number*10;
				
				if(product>100) {
				System.out.println("10 * "+number +" = "+ product + ">100 and you should try less than "+number);			
				
					}else
						System.out.println("good result");
			
			}
	}

}
