package Java;

import java.util.Collections;

public class catalizethe1stletter {

	public static void captialize(String value) {
		StringBuilder SB = new StringBuilder();
		String[] str = value.split(" ");
		
		for(int i=0; i<str.length;i++) {
			SB.append(Character.toUpperCase(str[i].charAt(0))).append(str[i].substring(1));
			SB.append(" ");
		}
		
		System.out.println(SB);
		
		
	}
	
	public static void main(String[] args) {
		captialize("hello world");

	}

}
