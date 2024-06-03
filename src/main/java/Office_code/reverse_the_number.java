package Office_code;

public class reverse_the_number {

	public static void reverse_num (String num) {
		StringBuilder sb = new StringBuilder(num);
		//System.out.println(sb.reverse());
		
		for(int i = num.length()-1;i>=0;i--) {
			System.out.print(num.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		reverse_num("-321");
	}

}
