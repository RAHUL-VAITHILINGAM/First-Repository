package practiceScenarios.scenarios4;

public class TamilNadu extends SouthIndia
{
static String capital = "Chennai";
public static void main(String[] args)
{
System.out.println("Our capital is "+India.capital);
System.out.println("Our state capital is "+TamilNadu.capital);
SouthIndia si = new TamilNadu();
si.cultivate();
si.livingStyle();
si.speakLanguage();
si.eat();
si.dress();
}
public void speakLanguage()
{
System.out.println("Speaking language : "+"Tamil");
}
public void eat()
{
System.out.println("Eating food : "+"Idly Dosa");
}
public void dress()
{
System.out.println("Traditional dresses : "+"Vest Saree");
}
void cultivate()
{
System.out.println("Major cultivation : "+"Rice and sugarcane cultivation");
}
void livingStyle()
{
System.out.println("Living style : "+"Above average development");
}
}
