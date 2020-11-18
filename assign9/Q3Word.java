package daily_assignments.assign9;

public class Q3Word {

	public static void main(String[] args) {
		
		String word = "java";
		if (word.length()>=3 && word.length()%2!=0) {
			System.out.println(word.charAt(word.length()/2));
		}else if(word.length()==1) {
			System.out.println(word.charAt(0)+""+word.charAt(0)+""+word.charAt(0));
		}
		
		if (word.length()>=4 && word.length()%2==0) {
			System.out.println(word.charAt((word.length()/2)-1)+""+word.charAt(word.length()/2));
		}else if(word.length()==2) {
			System.out.println(word.charAt(0)+""+word.charAt(1)+""+word.charAt(0)+""+word.charAt(1));
		}
		
		
		
	}

}
