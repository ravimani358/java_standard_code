package hashmap;

import java.util.UUID;

public class UUIDchecking {

	
	public static void check_Duration(String hours) {
		String[] str = hours.split("-");
		int from = Integer.parseInt(str[0]);
		System.out.println(from);
		String[] to_value = str[1].split(" ");
		int to = Integer.parseInt(to_value[0]);
		System.out.println(to);
	}
	
	public static void datasplit(String value) {
		String [] values = value.split(";");
		
		String city_name = values[0];
		String Advanture_name = values[1];
		String guest_Name = values[2];
		String Journy_date = values[3];
		String count = values[4];
		System.out.println(city_name);
		System.out.println(Advanture_name);
		System.out.println(guest_Name);
		System.out.println(Journy_date);
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
			
		//UUID id = UUID.randomUUID();
		//System.out.println(id);
		//check_Duration("6-12 Hours");
		datasplit("Bengaluru;Niaboytown;Chicky;01-01-2025;2");
		
		
	}

}
