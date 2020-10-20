package daily_assignments.lab1;

public class Q2Love6 {

	public static void main(String[] args) {
		
		love6(6,4);
		love6(5,9);
		love6(7,1);
		love6(3,6);
		
	}

	public static void love6(int num1, int num2) {
		
		if(num1==6 || num2==6 || num1+num2==6 || num1-num2==6 ||num2-num1==6) {
			System.out.println(true);
		}else
			System.out.println(false);
		
	}

}
