package Java;

public class fizzbuzz {

	public static void fizzbuzz(int n) {
		int i=1;
		while (i<=n) {
			if(i%3==0 && i%5==0) {
				System.out.println("FIZZ BUZZ");
			}else if(i%3==0) {
				System.out.println("FIZZ");
			}else if(i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		
		fizzbuzz(10);

	}

}
