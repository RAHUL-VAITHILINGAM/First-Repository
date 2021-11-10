class Triangle 
{
int base = 10;
int height = 20;
public static void main(String[] args)
{
Triangle tri = new Triangle();
System.out.println("Area of triangle is "+tri.calculateArea(tri.base,tri.height));
}
public int calculateArea(int base,int ht)
{
return (base*ht)/2;
}
}