package daily_assignments.assign9;

import java.util.Arrays;

public class Q5Merge {

	public static void main(String[] args) {
		
		String word1="oak";
		String word2="cat";
		String merge="";
		
		if (word1.length()==3 && word2.length()==3) {
			for (int i=0;i<3;i++) {
				merge=merge+word1.charAt(i)+word2.charAt(i);
				
			}System.out.println(merge);
		}else {
			System.out.println("invalid");
		}
			

	}

}
