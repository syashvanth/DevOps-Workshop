
public class isPrime {
	public static void main(String [] args)
	{
		int num = 50;
		int check = 0;
		
		for(int i=2; i < num;i++)
		{
			if(num%i == 0)
			{
				check++;
				break;
			}
		}
		
		if(check > 0)
		{
			System.out.println(num + " Is not PRIME");
		}
		else
		{
			System.out.println(num + " Is PRIME");
		}
	}
	
}
