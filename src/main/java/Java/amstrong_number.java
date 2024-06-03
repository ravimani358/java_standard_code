package Java;

public class amstrong_number {
	public static void amst_number() {
		int number = 153;
		int get_number_count = number;
		int original_number = number;
		int count = 0;
		int temp =0;
		
		while(get_number_count!=0) {
			get_number_count = get_number_count/10;
			count++;
		}
						
		while(number!=0){
			int number_digit = number;
			number_digit = number_digit%10;
			temp = temp + ((int) Math.pow(number_digit, count));
			number = number/10;
		}
		if(temp == original_number) {
			System.out.println("amsting number");
		}else {
			System.out.println("not a amstring number");
		}
	}
	public static void main(String[] args) {
		amst_number();

	}

}
