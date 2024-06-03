package Java;

public class Loop_statement {

	public static void print_10(int n) {
		for(int i=0; i<=n; i++) {
			System.out.println(i);
		}
	}
	
	public static void even_number(int n) {
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		//print_10(10);
		even_number(10);
	}

}
