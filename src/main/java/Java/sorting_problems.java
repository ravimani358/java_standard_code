package Java;

public class sorting_problems  {  
	
	public static void sort_arry(){
		int arr[] = {2,3,4,5,12,3,134,3};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int tmp = 0;  
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
			System.out.println(arr[i]);
		}
		
	}
public static void main(String[] args){  
	sort_arry();
	}	  
}  