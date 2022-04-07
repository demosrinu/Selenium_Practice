package interfaceconcept;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put(1, "iam");
		h.put(2, "srinivas");
		h.put(3, 'h');
		h.put(0, 100);
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		
		h.put("a", 100);
		h.put("b","namaste");
		h.put("c", 'h');
		
		for (int p=0;p<h.size();p++) {
			System.out.println(h.get(p));
		}

	}

}
