package daily_assignments.assignment5;

public class Question8 {

	public static void main(String[] args) {
		// WHILE LOOP UPPER BAND
		
		
		int upperBand=10;
		int n=1, sum=0;
		
		while (n<=upperBand) {
			
			System.out.print(n);
				if (n<upperBand) {
				System.out.print("+");
			}
			sum=(n*(n+1))/2;
			n++;
			
		}
		
		System.out.println(" = "+sum);
	}

}
