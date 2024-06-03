package Java;

public class lettersonly {

    public static void daily_activities() {
    	String input = "werwer!@as!@#a34as";
    	String letterOnly = input.replaceAll("[^0-9a-zA-Z]", "");
    	System.out.println(letterOnly);
    }
	
	public static void main(String[] args) {
		daily_activities();	

	}

}
