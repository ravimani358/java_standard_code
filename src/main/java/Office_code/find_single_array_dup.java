package Office_code;

public class find_single_array_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,3,5,4,4};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
