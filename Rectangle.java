class Rectangle 
{
	int length = 10;
	int breadth = 20;
public static void main(String[] args)
{
	Rectangle rec = new Rectangle();
System.out.println("Area of rectangle is "+rec.calculateArea(rec.length,rec.breadth));
	System.out.println("Perimeter of rectangle is "+rec.calculatePerimeter(rec.length,rec.breadth));
}
	public int calculatePerimeter(int length,int breadth)
	{
		return 2*(length+breadth);
	}
public int calculateArea(int length,int breadth)
{
return length*breadth;
}
}