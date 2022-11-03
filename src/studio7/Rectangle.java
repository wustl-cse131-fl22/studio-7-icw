package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle (double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double area()
	{
		double A = length * width ;
		return A;
	}

	public double perimeter()
	{
		double P = 2*length + 2*width;
		return P;
	}
	
	public boolean isSquare()
	{
		if (length == width)
		{
			boolean square = true;
			return square;
		}
		else
		{
			boolean square = false;
			return square;
		}
	}
	
	public boolean isSmaller(double Area1, double Area2)
	{
		if (Area1<Area2)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public static void main(String[] args)
	{
		Rectangle R1 = new Rectangle(5,4);
		Rectangle R2 = new Rectangle(10,10);
		
		System.out.println("Area of Rectangle one: " + R1.area());
		System.out.println("Perimeter of Rectangle one: " + R1.perimeter());
		
		System.out.println("Area of Rectangle two: " + R2.area());
		System.out.println("Perimeter of Rectangle two: " + R2.perimeter());
		
		System.out.println("Rectangle one is a square: " + R1.isSquare());
		System.out.println("Rectangle two is a square: " + R2.isSquare());
		System.out.println("Rectangle 1 is smaller than rectangle 2: " + R1.isSmaller(R1.area(), R2.area()));
	}
	}
	

