package Java;

import java.util.HashSet;
import java.util.Set;

public class count_character {
	public static void chars() {
		String word = "Hello";
		String duplicate = "";
		
		for(int i=0; i<word.length();i++) {
			char word_char1 = Character.toLowerCase(word.charAt(i));
			int count = 1; 
		//System.out.println(duplicate.indexOf(word_char1) );
			if(duplicate.indexOf(word_char1) == -1) {
				for(int j=i+1; j<word.length();j++) {
					if(word_char1 == Character.toLowerCase(word.charAt(j))) {
						count++;
						duplicate = duplicate + word_char1;
					}
				}
				
				System.out.println(word_char1+" -> "+count);
			}
		}
		
	}
	
	public static void main(String[] args) {
		chars();

	}

}
