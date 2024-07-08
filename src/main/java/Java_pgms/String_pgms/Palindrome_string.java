package Java_pgms.String_pgms;

import java.util.Scanner;

public class Palindrome_string {
	
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to reverse:");
	String str=sc.nextLine();
	String ori_str=str;
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
	}
	if(ori_str.equals(rev)) {
		System.out.println(ori_str+" is a palindrome");
	}else {
		System.out.println(ori_str+" is not a palindrome");
	}
	
	

}}
