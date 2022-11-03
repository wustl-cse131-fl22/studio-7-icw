package studio7;

public class Die {

	private int sides;
	
	public Die (int n)
	{
		sides = n;
	}
	
	public int roll()
	{
		int roll = (int)(Math.random()*(sides-1)+1);
		return roll;
	}
	
	public static void main(String[]args)
	{
		Die roll1 = new Die(6);
		System.out.print(roll1.roll());
	}
}
