package Numberprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE NUMBER : ");
		
		int fact = 1;
		
		int a = sc.nextInt();
		
		for(int i = 1;i<=a;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("FACTORIAL : "+fact);
		
		
		

	}

}
