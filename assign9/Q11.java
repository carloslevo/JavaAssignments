package daily_assignments.assign9;

public class Q11 {

	public static void main(String[] args) {
		
		String email = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		String sender, phoneNumber, messageBody;
		
		sender = email.substring(email.indexOf('<')+1,email.indexOf('>') );
		phoneNumber = email.substring(email.indexOf('[')+1, email.indexOf(']'));
		messageBody =  email.substring(email.indexOf('{')+1, email.indexOf('}'));
				
		
		System.out.println("Sender: " + sender);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Message: " + messageBody);

	}

}
