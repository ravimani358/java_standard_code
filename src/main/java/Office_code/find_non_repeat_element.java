package Office_code;

public class find_non_repeat_element {

	public static void condition1(String word) {
		for(int i=0; i<word.length();i++) {
			char letter = Character.toLowerCase(word.charAt(i));
			for(int j =i+1; j<word.length();j++) {
				if((letter != (Character.toLowerCase(word.charAt(j))))){
					System.out.println(letter);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "leetcode";
		condition1(input);
	}

}
