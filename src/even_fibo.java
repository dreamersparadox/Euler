
public class even_fibo
{
	public static void main(String[] args)
	{
		int a = 0, b = 1, c = 0;
		int total = 0;
		//System.out.println("0\n"+"1");
		for(int i = 1 ; i < 45 ; i++)
		{
			c = a+b;
			if(c%2==0 && c<=4000000)
			{
				//System.out.println();
				total = total+c;
				System.out.println(i+"\t"+c+"\t\t"+total);
			}			
			a = b;
			b = c;			
		}
	}
}
