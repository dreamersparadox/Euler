import java.util.ArrayList;

public class multiples35 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		int sum = 0, total = 0;
		@SuppressWarnings("rawtypes")
		ArrayList three = new ArrayList();
		for(int i = 1; i < 1000; i++)
		{
			if(i%3 == 0 || i%5 == 0)
				three.add(i);
			//System.out.println(three[i]);
			//System.out.println(three.get(5));
		}
		
		for(int i = 0; i < three.size()-1 ; i++)
		{
			sum = (int) three.get(i);
			total = total + sum;
		}
		System.out.println(total);
	}
}
