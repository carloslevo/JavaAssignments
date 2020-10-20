package daily_assignments.lab1;

public class Q6CigarParty30 {

	public static void main(String[] args) {
		
		cigarParty(30,false);
		cigarParty(50, false);
		cigarParty(70,true);
		

	}

	public static void cigarParty(int numberCigars, boolean isWeekend) {
		
		if(isWeekend) {
			if(numberCigars>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(numberCigars>40 && numberCigars<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
		
	}

}
