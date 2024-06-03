package Office_code;

import java.util.*;

public class number_array_sort {
	
	public static void tree_set() {
		int arr [] = {1,23,4,5,5,6,7,8,9};
		
		Set<Integer> check = new TreeSet<Integer>();
		
		for(int i : arr) {
			check.add(i);
		}
		
		System.out.println(check);
	}
	
	public static  void ascent_count() {		
        int arr[] = {5, 7, 6, 9, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }	
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
	}

	public static void main(String[] args) {
		
		//tree_set();
		
		//ascent_count();
		
		int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		
		if(Arrays.equals(arr, arr1)) {
		System.out.println("working");	
		}else {
			System.out.println("not wokring");
		}
	}

}
