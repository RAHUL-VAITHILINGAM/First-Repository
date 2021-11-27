package practiceScenarios.scenarios2;

public class ActorSivaKumar implements Actor
{
static String address = "Coimbatore";
public ActorSivaKumar()
{
System.out.println("Dynamic binding");
}
public ActorSivaKumar(int number,String car_brand)
{
System.out.println("static binding");
}
public static void main(String[] args)
{
ActorSivaKumar as = new ActorSivaKumar(65,"Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println(ActorSivaKumar.address);
Actor ac = new ActorSivaKumar();
ac.act();
ac.dance();
ac.sing();
System.out.println(ac.address);
}
public void act()
{
System.out.println("Acting");
}
public void dance()
{
System.out.println("Dance");
}
public void sing()
{
System.out.println("Sing");
}
public void speaking()
{
System.out.println("Speaking");
}
}
