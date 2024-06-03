package Java;

import java.util.ArrayList;

public class remove_duplicate_arrayof2 {

	public static void duplicate_arrayof2() {
		int arr[] = {1, 2, 3, 4, 5, 6};
        int arr1[] = {5, 2, 6, 8, 9};
        
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length;i++) {
        	boolean first_arr_stop_loop = false;
        	for(int j=0; j<arr1.length;j++) {
        		if(arr[i]==arr1[j]) {
        		first_arr_stop_loop = true;
        		break;
        		}
        	}
        	if(!first_arr_stop_loop) {
        		arr_list.add(arr[i]);
        	}
        }
             
        for(int k = 0; k<arr1.length;k++) {
        	
        	boolean stoploop = false;
        	for(int l =0; l<arr.length;l++) {
        		if(arr1[k] == arr[l]) {
        			stoploop = true;
        			break;
        		}
        	}
        	if(!stoploop) {
        		arr_list.add(arr1[k]);
        	}
        }
        
        System.out.println(arr_list);
	}
    
    public static void main(String[] args) {
    	duplicate_arrayof2();
    }
}
