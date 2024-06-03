package Office_code;

public class prime_number {

	public static void IsPrime(int num) {
		int count =0;
		for(int i=1; i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
	}
	
	public static void main(String[] args) {
		IsPrime(6);

	}

}
