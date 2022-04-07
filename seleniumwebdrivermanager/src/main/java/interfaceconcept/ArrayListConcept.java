package interfaceconcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);// here add means we are inserting value into array
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		
		ar.add("hello");
		ar.add('m');
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		ar.remove(5);
		System.out.println(ar.size());
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();//only specified data type allowed
		
		ar1.add(100);
		
		ArrayList<Character> ar2 = new ArrayList<Character>();
		
		ar2.add('k');
		
		ArrayList<String> ar3 = new ArrayList<String>();
		
		ar3.add("srinivas");
		
		System.out.println(ar1.get(0));
		System.out.println(ar2.get(0));
		System.out.println(ar3.get(0));

	}

}
