package code_studio_collections;

import java.util.HashSet;

public class Hash_set_2 {
//	*/union and interesction*/

	public static void main(String[] args) {
		
		HashSet<String> set_A=new HashSet<String>();
		HashSet<String> set_b=new HashSet<String>();
		set_A.add("shiva");
		set_b.add("basava");
		
		set_A.addAll(set_b);
		System.out.println(set_A);
//		set_A.retainAll(set_b);
//		System.out.println(set_A);
//		set_A.removeAll(set_b);
//		System.out.println(set_A);
		System.out.println(set_A.containsAll(set_b));

	}

}
