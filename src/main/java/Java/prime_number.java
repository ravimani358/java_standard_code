package Java;

import java.util.ArrayList;

public class prime_number {

    public static void daily_activities(int input) {
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	
    	for(int i=1; i<= input; i++) {
    		int count = 0;
    		for(int j=1; j<=i; j++) {
    			if(i%j == 0) {
    				count++;
    			}
    		}
			if(count ==2) {
				//System.out.println(i + " is a prime number");
				arr.add(i);
			}
    	}
    	int max_element = arr.size()-1;
    	System.out.println(arr.get(max_element));
    }
	
	public static void prime_no(int n) {
		int count = 0;
		int i=1;
		
		while(i<=n) {
			
			if(n%i==0) {
				count ++;
			}
			
			i++;
		}
		
		if(count == 2) {
			System.out.println("given number is prime number");
		}else {
			System.out.println("this is not a prime number");
		}
		
	}
	
	
	public static void main(String[] args) {
		prime_no(4);
		int max_number = 100;
        daily_activities(max_number);
	}

}
