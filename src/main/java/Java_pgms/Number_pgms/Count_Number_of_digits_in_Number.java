package Java_pgms.Number_pgms;

import java.util.Scanner;

public class Count_Number_of_digits_in_Number {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
				n=n/10;
				count ++;
		}
		System.out.println("number of digits in number is "+count);
		
	}

}
