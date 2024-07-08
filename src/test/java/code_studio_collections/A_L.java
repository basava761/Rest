package code_studio_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class A_L {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("om gajananaaya namaha");
		al.add("Danda gundaasava");
		al.add("harahara mahadev");
		al.add("karthikeya namaha....");
		al.add(1, "parvati patheyee...");
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println("using iterator");
			System.out.println(itr.next());
		}
		for(String s:al) {
			System.out.println("using for loop");
			System.out.println(s);
		}
		Collections.sort(al);
		System.out.println("aftersorting+"+al);
		System.out.println("using for loop------------------------------------------------------------------------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		

		System.out.println(al.size());
		
		
	}}