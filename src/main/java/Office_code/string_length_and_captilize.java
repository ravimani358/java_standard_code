package Office_code;

public class string_length_and_captilize {

	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
		
		if(a.length()>b.length()) {
			System.out.println(a.length()+b.length());
			System.out.println("No");
		}
		
		String a_1st_letter = a.substring(0,1).toUpperCase();
		String b_1st_letter = b.substring(0,1).toUpperCase();
		
		System.out.println(a_1st_letter+a.substring(1,a.length())+" "+b_1st_letter+b.substring(1,b.length()));
		
	}

}
