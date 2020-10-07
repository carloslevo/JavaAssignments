package daily_assignments.assignment5;

public class Question13 {

	public static void main(String[] args) {
		
		for(int j=2;j<=9;j++) {
		if(j%2==0) {
			
		for (int i=1; i<=8;i++) {
			if (i%2!=0) {
				System.out.print(" W ");
			}else
				System.out.print(" B ");
		}System.out.println();
					
		}else {
			for (int i=1; i<=8;i++) {
				if (i%2!=0) {
					System.out.print(" B ");
				}else
					System.out.print(" W ");
			}System.out.println();
			}
		}
	
	
		
		
		
		
	}
}
