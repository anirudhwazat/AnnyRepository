package Numberprogram;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE NUMBER : ");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("");
			System.out.println(a+" : IS EVEN NUMBER");
		}
		else
		{
			System.out.println("");
			System.out.println(a+" : IS ODD NUMBER");
		}
		
		
		
		
		
		
		
		

	}

}
