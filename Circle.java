class Circle 
{
	 double pi = 3.14;
	static int radius = 5;
public static void main(String[] args)
{
	Circle circle = new Circle();
System.out.println("Area of circle is "+circle.calculateArea(radius));
	System.out.println("Circumference of circle is "+calculatePerimeter(radius,circle.pi));
}
	public double calculateArea(int rad)
	{
	return this.pi *rad * rad;
	}
	public static double calculatePerimeter(int radius,double pi)
	{
	return pi*2*radius;	
}