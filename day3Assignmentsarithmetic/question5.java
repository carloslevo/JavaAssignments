package daily_assignments.day3;

public class question5 {

	public static void main(String[] args) {
		// HOUR MIN SEC
		
		int inputSecond, hour, min, sec;
		
		inputSecond= 7645;
		
		hour= inputSecond /3600;		
		min=(inputSecond %3600)/60;
		sec=(inputSecond %3600)%60;
		
		System.out.println(hour + " hours, " +  min + " minutes, " + sec + " seconds");

	}

}
