package calculation;
public class Factorial
{
	public int facttorial(int a)
	{
		int fact = 1;
		while(a > 0)
		{
			fact = fact * a;
			a--;
		}
		return(fact);
	}
}