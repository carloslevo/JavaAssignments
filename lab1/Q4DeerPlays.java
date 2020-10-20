package daily_assignments.lab1;

public class Q4DeerPlays {

	public static void main(String[] args) {
		
		deerplays(70, false);
		deerplays(95, false);
		deerplays(95, true);
		

	}

	public static void deerplays(int temp, boolean isSummer) {
		
		if (isSummer) {
			if(temp>60 && temp<100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>60 && temp<90) {
			System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}

}
