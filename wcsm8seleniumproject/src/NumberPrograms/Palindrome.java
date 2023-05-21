package NumberPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
	int a = 101;
	int temp=101;
	int newA=0;
	int last;
	
	while(temp>0)
	{
		last=temp%10;	//last = 101%10=1		last = 1
		newA = (newA*10)+last;
		temp=temp/10;
		
	}
	if(newA==a)
	{
		System.out.println("IT IS PALINDROME : "+newA);
	}
	else
	{
		System.out.println("IT IS NOT PALINDROME : "+newA);
	}
	
	
	
	
	
	
	
	
	}

}
