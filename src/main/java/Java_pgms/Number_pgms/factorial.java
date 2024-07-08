package Java_pgms.Number_pgms;


import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		double fact=1;
		for (int i = 1; i < n+1; i++) {
			fact=fact*i;
			
			
		}
		System.out.println("factorial of the number is "+fact);
		
	}

}
