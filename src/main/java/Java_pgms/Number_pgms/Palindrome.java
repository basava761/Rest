package Java_pgms.Number_pgms;

import java.util.Scanner;

public class Palindrome {
			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			int orig_n=n;
			int rev=0;
			while(n!=0) {
				rev=rev*10+n%10;
				n=n/10;
			}
			if(rev==orig_n) {
				System.out.println(orig_n+" is a palindrome number");
			}else {
				System.out.println(orig_n+" is a not palindrome number");
			}
			
		}
		
		
		
	}


