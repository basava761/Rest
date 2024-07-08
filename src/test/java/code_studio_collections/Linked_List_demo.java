package code_studio_collections;

import java.util.Iterator;
import java.util.LinkedList;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Linked_List_demo {

	public static void main(String[] args) {
		
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("wagonor");
		cars.add("Thar");
		cars.addFirst("volvo");
		cars.addLast("Fortuner");
		System.out.println(cars);
		System.out.println(cars.size());
		System.out.println("========================================================================================");
		
//		using for loop
		System.out.println("foreach ============================================");
		for(String c:cars) {
						System.out.println(c);
		}
		System.out.println("for lopp=========================================================================00000000000000");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("using Iterator55555555555555555555555555555555555555555555555555555555");
		Iterator it= cars.iterator();
		{
			while(it.hasNext()) {
				System.out.println(it.next());
			}

	}

}}
