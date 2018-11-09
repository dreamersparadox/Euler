import java.util.ArrayList;
import java.util.Collections;

public class palindrome
{
	public static boolean isPalindrome(int integer) 
	{
	    String intStr = String.valueOf(integer); 
	    return intStr.equals(new StringBuilder(intStr).reverse().toString());
	}
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		for( int i = 100; i < 1000; i++)
		{
			for( int j = 100; j < 1000; j++)
			{
				if(isPalindrome(i*j))
					list.add(i*j);				
			}
		}
		System.out.println(Collections.max(list));
	}
}
