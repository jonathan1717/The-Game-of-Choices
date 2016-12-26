
public class p {

	public static void main(String[] args) 
	{

	}
	public static void print(String s)    
	{
		for(int i = 0; i < s.length(); i++)
			{
				System.out.print(s.substring(i, i+1));
				try
					{
						Thread.sleep(50);
					}
						catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
	}
}
