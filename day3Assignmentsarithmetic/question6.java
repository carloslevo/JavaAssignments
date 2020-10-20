package daily_assignments.day3;

public class question6 {

	public static void main(String[] args) {
		
		// Caffeine Math.ceil()
		
		int indrink = 600;
		double dailylimit = 10_000;
		double k =  dailylimit/indrink;
		
		System.out.println("Number of mg in driks " + indrink );
		System.out.println("It would take about " + Math.ceil(k) + " drinks for a lethal overdose");

	}

}
