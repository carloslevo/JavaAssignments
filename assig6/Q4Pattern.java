package daily_assignments.assig6;

public class Q4Pattern {

	public static void main(String[] args) {
		
		for(int k=1; k<=7; k++) {
			for(int m=1; m<=k; m++) {
				if(m%2!=0) {
				System.out.print("1");
				}else
					System.out.print("0");	
			}System.out.println();
			
		}

	}

}
