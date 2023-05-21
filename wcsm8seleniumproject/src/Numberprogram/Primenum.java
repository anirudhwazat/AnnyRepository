package Numberprogram;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 79;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
				
		}
		if(count==2)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not Prime no");
		}

	}

}
