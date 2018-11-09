import java.util.ArrayList;

public class largestPrimeFactor
{
	public static void factorize(int a)
	{
		//int j=0;
		
		for( int i = 2; i<a; i++)
		{
			if(a%i==0)
			{
				factor(i);
			}
		}
		//return j;
	}
	public static void factor(int a)
	{
		int count = 0;
		for( int i = 2; i<a; i++)
		{
			
			if(a%i==0)
			{
				count++;
			}
			if(count==2)
		{
				System.out.println(i);
				count=0;
		}
		}
		
	}
	public static void main(String args[])
	{
		int x = 32;		
		factorize(x);
	}
}
