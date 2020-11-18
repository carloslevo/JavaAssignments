package daily_assignments.assign9;

public class Q6 {

	public static void main(String[] args) {
		
		String word="oscar";
		String reverse="";
		
		if(word.length()==5) {
			for(int i=4; i>=0;i--) {
				reverse = reverse+word.charAt(i);
			}	
		}else if(word.length()<5) {
			System.out.println("too short");
		}else if(word.length()>5) {
			System.out.println("too long");
		}
		System.out.println(reverse);

	}

}
