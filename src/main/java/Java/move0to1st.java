package Java;

public class move0to1st {

	public static void movezerotofirst(String Value) {
		
		StringBuilder SB = new StringBuilder();
		
		for(int i=0; i<Value.length();i++){
			
			char character = Value.charAt(i);
			if(character =='0') {
				SB.insert(0, character);
			}else {
				SB.append(character);
			}
		}
		
		System.out.println(SB);
		
	}
	
	public static void main(String[] args) {
		
		String value = "102010101010";
		movezerotofirst(value);
	}

}
