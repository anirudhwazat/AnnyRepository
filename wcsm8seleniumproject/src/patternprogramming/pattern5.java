package patternprogramming;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int r =1;r<=5;r++)
		{
			for(int c = 1;c<=5;c++)
				{
					if(c+r>=6)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
			System.out.println();
		}

	}

}

// r=1	r<=5(T)   c=1   c<=5(T)    if(c>=r)  o/p:*




//	        * 
//	      * *
//      * * *
//    * * * *
//  * * * * *

