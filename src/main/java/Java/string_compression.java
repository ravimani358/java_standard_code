package Java;

public class string_compression {
	public static void str_comp() {
		String str = "aaabbcc";
		String duplicate = "";
		
		for(int i=0; i<str.length();i++) {
			char str_char = Character.toLowerCase(str.charAt(i));
			int count =1;
			if(duplicate.indexOf(str_char)==-1) {
				for(int j=i+1; j<str.length();j++) {
					if(str_char == Character.toLowerCase(str.charAt(j))) {
						count++;
						duplicate = duplicate + str_char;
					}
				}
				System.out.println(str_char+" "+ count);
			}
		}
	}
	public static void main(String[] args) {
		str_comp();
	}

}
