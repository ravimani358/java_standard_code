package Java;

public class vowels_and_conson {
	public static void vowels_consol () {
		String word = "Hello world";
		String space_removed_word = word.replace(" ", "");
		String vowels = "aeiou";
		int vowels_count = 0;
				
		for(int i=0; i<space_removed_word.length();i++) {
			for(int j=0; j<vowels.length();j++) {
			if(Character.toLowerCase(space_removed_word.charAt(i)) == Character.toLowerCase(vowels.charAt(j))) {
				vowels_count++;
				}
			}
		}
		
		int consol_count = space_removed_word.length() - vowels_count;
		int Operation_required = consol_count - vowels_count;
		System.out.println(Operation_required);
	}
	
	public static void main(String[] args) {
		vowels_consol();
	}

}
