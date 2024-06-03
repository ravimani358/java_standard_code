package Java;

public class reverse_string {

	public static void reverse_string(String value) {
		
		for(int i=value.length()-1; i>=0; i--) {
			System.out.print(value.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		reverse_string("Hello");
		
	}

}
