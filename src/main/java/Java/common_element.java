package Java;

import java.util.ArrayList;
import java.util.List;

public class common_element {

	public static void common_array() {
		int arr[] = {1,2,3,4,5,6};
		int arr1[] = {5,2,6,8,9};
		
		List<Integer> list = new ArrayList<Integer>();  
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					list.add(arr[i]);
					}
				}
			}
		System.out.println(list);
		}
	
		public static void main(String[] args) {
		common_array();
	
		
			}

		}