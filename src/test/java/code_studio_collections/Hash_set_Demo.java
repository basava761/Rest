package code_studio_collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set_Demo {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("bsavanna");
		h.add("bsavanna");
		h.add("rakshasa");
		h.add("tatva");
		h.add("tatvamasi");
		h.add("23456");
		System.out.println(h.size());
		System.out.println(h.contains("bsavanna"));
		System.out.println(h.contains("bMw"));
		System.out.println(h);
		
		System.out.println(h.isEmpty());
		System.out.println("==================foreach=================");
		for(Object e:h) {
			System.out.println(e);
		}
		System.out.println("-------------------using iterator--------------------");
		Iterator it=h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
