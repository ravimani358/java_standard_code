package Office_code;

import java.lang.reflect.Array;

public class arrayandsum {

	public static void find_index(int [] arr, int target) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				if(sum == target) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = {2,7,11,15};
		find_index(arr, 9);
	}

}
