class Square
{
public static void main(String[] args)
{
//Square sqr = new Square();
int area = new Square().calculateArea(10);//Anonymous object
System.out.println(area);
}
public int calculateArea(int length)
{
return length*length;
}
}