package daily_assignments.assig6;

public class Q5Pattern {

	public static void main(String[] args) {
		
		for(int z=1; z<=7; z++) {
			for(int t=1; t<=7; t++) {
				if(t>7-z) {
					System.out.print(z);
				}else				
					System.out.print("1");
							
			} System.out.println();
		}

	
}
}
