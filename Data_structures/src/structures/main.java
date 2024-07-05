package structures;

import java.util.Iterator;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> liste = new LinkedList<>();
		liste.add("Peter");
		liste.add("Thomas");
		liste.add("Sabrina");
		
		Iterator it = liste.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
