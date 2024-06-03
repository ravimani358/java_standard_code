package Java;

public class fibonacci_number {
	public static void fib_10(int n) {
		int i=0; int j=1;
		
		while(i<n) {
			int k= i+j;
			//System.out.println(i);
			i=j;
			j=k;
			
		}
	}
	
	public static boolean find_fib(int n) {
		
		int i=0; int j=1;
		
		while(i<=n) {
			
			if(i==n) {
				return true;
			}
			
			int k=i+j;
			i=j;
			j=k;
			
		}
		
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		//fib_10(10);
		//isFibonacci(10);
		
		if(find_fib(1)) {
			System.out.println("is a fib number");
		}else {
			System.out.println("not a fib number");
		}

	}

}
