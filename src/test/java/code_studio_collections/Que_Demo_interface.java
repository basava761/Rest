package code_studio_collections;

import java.util.PriorityQueue;

public class Que_Demo_interface {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("basava");
		pq.add("shivaa");
		pq.offer("mahashakti");
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);

}}
