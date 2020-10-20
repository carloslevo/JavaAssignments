package daily_assignments.assig6;

public class Q3Pattern {

	public static void main(String[] args) {
	
		for(int i=1; i<=7; i++) {
			for(int j=i; j<=7;j++) {
				System.out.print(" "+j );
				
			}System.out.println();
			if(i<7) {
			for(int k=1; k<=i;k++) 
				System.out.print(" ");
			}
			
		}System.out.print("     ");
		
		for(int i=6; i>=1; i--) {
			for(int j=i; j<=7;j++) {
				
					System.out.print(" "+j );
					
			}System.out.println();
				for(int k=2; k<i;k++) 
					System.out.print(" ");
				
			
		}
}
}