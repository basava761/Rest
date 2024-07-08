package Java_pgms.String_pgms;

import java.util.Scanner;

public class Reverse_string {
	
	
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to reverse:");
	String str=sc.nextLine();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
	}

	System.out.println(rev);
}
}