package Office_code;

import java.util.Vector;

public class victor_test {

	public static void main(String[] args) {
		Vector checking = new Vector();
		checking.addElement(6);
		checking.addElement(6.3);
		checking.addElement('R');
		checking.addElement("Ravisankar N");
		
		System.out.println(checking);
		
		for(int i=0; i<checking.size(); i++) {
			System.out.println(checking.get(i));
		}
		
	}

}
