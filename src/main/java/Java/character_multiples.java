package Java;

public class character_multiples {
    
    public static void multiChar() {
        String str = "Hello there";
        
        String duplicate = "";
        
        for(int i=0; i<str.length();i++) {
        	char characters = Character.toLowerCase(str.charAt(i));
        	if(duplicate.indexOf(characters) == -1) {
        	for(int j=i+1;j<str.length();j++) {
        		if(characters == Character.toLowerCase(str.charAt(j))) {
        			System.out.println(characters);
        			duplicate = duplicate+characters;
        			break;
        				}
        			}
        		}
        	}
     	}     
   	//}
    
    public static void main(String[] args) {
        multiChar();
    }
}
