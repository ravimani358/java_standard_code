package Office_code;

public class find_smallest_number {

	public static void main(String[] args) {
		int[] arr = {5,3,6,1,2};
		int k = arr[1];
		for(int i = 0; i<arr.length;i++) {
			if(k>=arr[i]) {
			k = arr[i];	
			}
		}
		System.out.println(k);
	}

}
