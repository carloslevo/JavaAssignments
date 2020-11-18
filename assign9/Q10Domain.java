package daily_assignments.assign9;

public class Q10Domain {

	public static void main(String[] args) {
		
		String email = "john_westly@apple.com";
		System.out.println("First name:" + email.substring(0, email.indexOf("_")));
		System.out.println("Last name: " +email.substring(email.indexOf("_")+1, email.indexOf("@")));
		System.out.println("Domain: " + email.substring(email.indexOf("@")+1, email.indexOf(".")));
		System.out.println("Top domain :" +email.substring(email.indexOf(".")+1));
		
	}

}
