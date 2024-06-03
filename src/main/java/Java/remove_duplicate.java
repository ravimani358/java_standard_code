package Java;

public class remove_duplicate {
	
	public static void remove_duplicate() {
		int [] arr = {1,1,2,42,3};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		remove_duplicate();
	}
}
