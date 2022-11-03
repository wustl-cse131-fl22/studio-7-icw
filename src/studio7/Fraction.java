package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public String frac()
	{
		return (numerator + "/" + denominator);
	}
	
	public String addFraction(int n1, int d1, int n2, int d2)
	{
		if (d1 == d2)
		{
		int numeratorSum = n1 + n2;
		return numeratorSum + "/" + d1;
		}
		else
		{
		int numeratorSum = n1*d2 + n2*d1;
		int denom = d1*d2;
		return numeratorSum + "/" + denom;
		}
	}
	
	public String multFraction(int n1, int d1, int n2, int d2)
	{
		double numeratorMultiply = n1*n2;
		double denomMultiply = d1*d2;
		return numeratorMultiply + "/" + denomMultiply;

	}
	
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	
	public static void main (String[] args) {
		Fraction fraction1 = new Fraction(3,4);
		Fraction fraction2 = new Fraction (2,3);
		
		System.out.println("fraction 1: " + fraction1.frac());
		System.out.println("fraction 2: " + fraction2.frac());
		
		System.out.println("Added fractions: " + fraction2.addFraction(3,4,2,3));
		System.out.println("Multiplied fractions: " + fraction2.multFraction(3,4,2,3));
		System.out.println("reciprocal 1: " + fraction1.reciprocal());
		System.out.println("reciprocal 2: " + fraction2.reciprocal());
	}
}
