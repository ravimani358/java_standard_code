package Office_code;

import java.util.Arrays;
import java.util.Collections;

public class missing_element {

	public static void main(String[] args) {
		int a[] = {1,4,3,2,8,6,7};
		//1345678
		Arrays.sort(a);
		for(int i=0; i<a.length;i++) {
			if(a[i]!=i+1) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
