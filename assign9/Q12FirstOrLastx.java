package daily_assignments.assign9;

public class Q12FirstOrLastx {

	public static void main(String[] args) {
		
		String word = "levox";
		
		if(word.charAt(0)=='x'  && word.charAt(word.length()-1    )=='x') {
			System.out.println(word.substring(1, word.length()-1));
			
		}else if (word.charAt(0)=='x' ) {
			System.out.println(word.substring(1));
		}else if( word.charAt(word.length()-1   )=='x' ) {
			System.out.println(word.substring((0),word.length()-1));
		}

	}

}
