public class SuperMarket
{
String name;
public static void main(String[] args)
{
SuperMarket customer1 = new SuperMarket();
	SuperMarket customer2 = new SuperMarket();
customer1.name = "Rahul";
	customer2.name = "Raju";
System.out.println("Using reference name ="+customer1.name);
	System.out.println("Using reference name ="+customer2.name);
customer1.purchase();
	customer2.purchase();
}
public void purchase()
{
System.out.println("Using this keyword ="+this.name);
}
}