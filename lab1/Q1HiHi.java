package daily_assignments.lab1;

public class Q1HiHi {

	public static void main(String[] args) {
		
		
		sayHi("Hi", 3);
		System.out.println();
		//sayHi("Levo",5);
		
		

	}

	public static void sayHi(String word, int x) {
		
		String str="";
		for (int i=1; i<=x; i++) {
		str=str+word;
		
		}System.out.print(str);
	}

}
