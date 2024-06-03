package Java;

public class palindrome {
	
	public static void palinornot(String str) {
		String store_str = str.toLowerCase();
		char reverse_char ;
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse_char = Character.toLowerCase(str.charAt(i));
			sb.append(reverse_char);
		}
		
		if(store_str.equals(sb.toString())) {
			System.out.println("this is palindrome");
		}else {
			System.out.println("this is not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		String word = "ABC";
		palinornot(word);
	}

}
