package daily_assignments.assignment5;

public class Question5_Loop {
	
	public static void main(String[] args) {
		
		//FOR LOOP
		
		for(int k=1;k<=10;k++) {
			int sum=k*12;
			System.out.println("12 X "+k+" = "+sum);
		}
		System.out.println("=========================");
		//WHILE LOOP
		int num=1;
		while (num<11) {
			System.out.println("12 X "+num+" = "+(num*12));
			num++;
		}
		// DO WHILE LOOP
		System.out.println("=========================");
		
		int i=1;
		do {
			System.out.println("12 X "+i+" = "+(i*12));
			i++;
		}while (i<=10);	
		
		
	}

}
