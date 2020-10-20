package daily_assignments.assig6;

public class Q6Pattern {

	public static void main(String[] args) {
		int k;
		for (int i=1; i<=5; i++) {
			k=i;
			for(int j=1; j<=i; j++) {
				
				System.out.print(k+ " ");
				k=k+5-j;
				
			}System.out.println();
		}
		 
		
	
}
}
