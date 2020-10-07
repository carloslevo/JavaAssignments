package daily_assignments.assignment5;

public class Question9 {
	
	public static void main(String[] args) {
		
		int end=10;
		int oddNumber=1, n=1;
		
		System.out.print("OUTPUT = ");
		
		while (n<=end) {
			
			
				if ((n%2)==1) {
				System.out.print(n);
					if(n<end-1) {
					System.out.print(",");
				}
			}				
				
			n++;
			
		}
		
	
}
}
