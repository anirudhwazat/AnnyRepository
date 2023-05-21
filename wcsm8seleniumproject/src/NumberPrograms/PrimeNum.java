package NumberPrograms;

public class PrimeNum {

	public static void main(String[] args) {
		
		int num = 13;
		int count = 0;
		for(int i =2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		
	}

}
