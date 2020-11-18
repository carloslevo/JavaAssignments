package daily_assignments.assign9;

public class Q4 {

	public static void main(String[] args) {
		
		String word = "Mechanico";
		if(word.length()>5 && word.length()%2!=0) {
			System.out.println(word.substring((word.length()/2)-1,(word.length()/2)+2 ));
		}else
			System.out.println("invalid");

	}

}
