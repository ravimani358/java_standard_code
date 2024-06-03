package Office_code;

public class factorial {

	public static void fact(int num) {
		int sum = 1;
		for(int i=num; i>=1; i--) {
			sum = sum*i;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(5);
	}

}
