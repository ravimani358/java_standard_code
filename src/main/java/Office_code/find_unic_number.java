package Office_code;

import java.util.*;

public class find_unic_number {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for(int i : arr) {
        	treeSet.add(i);
        }
        
        System.out.println(treeSet);
    }
}
