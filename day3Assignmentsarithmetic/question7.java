package daily_assignments.day3;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int payment=100;
		int price=15;
		int change=payment-price;
		int quarter= change/25;
		int dimes= (change-quarter*25)/10;
		int nickle=(change-quarter*25 - dimes*10)/5;
		System.out.println("Your change is " + change + " cents and "+ quarter + " quarters " + dimes + " dimes " + nickle + " nickles" );

	}

}
