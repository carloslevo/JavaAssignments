package daily_assignments.assign9;

public class Q9SwapNames {

	public static void main(String[] args) {
		
		String email = "mike_tyson@cyber.org";
		String swap = "";
		if (email.contains("_")) {
		swap=email.substring(email.indexOf("_")+1, email.indexOf("@"));
		swap=swap.concat("_").concat(email.substring(0, email.indexOf("_")));
		swap=swap.concat(email.substring(email.indexOf("@")));
		System.out.println(swap.toString());
		}else {
			System.out.println(email);
		}
	}

}
