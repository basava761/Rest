package code_studio_collections;

import java.util.HashMap;

public class Demo_Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("name", "basava");
		h.put("Aradhya", "shivashakti");
		
		System.out.println(h.get("name"));
		System.out.println(h.isEmpty());
		System.out.println(h.containsKey("name"));
		System.out.println(h);
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
		System.out.println(h.values());
		String v=h.get("name");
		System.out.println(v);
		System.out.println(h.size());
		

	}

}
