package Java;

public class remove_duplicatein_array {

	public static void remove_duplicate_array() {
		int [] arr = {3, 5, 2, 7, 3, 8, 2, 5};
		
		for(int i=0; i<arr.length;i++) {
			boolean check = false;
			for(int j=i+1; j<arr.length; j++) {
			if(arr[i] == arr[j]) {
				check = true;
				break;
				}
			}
		
		if(!check) {
			System.out.println(arr[i]);	
			}
		}
	}
	
	public static void main(String[] args) {
		remove_duplicate_array();

	}

}
