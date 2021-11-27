package scenarios5.tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules{
	
	public static void main(String[] args)
	{
		CommonManInChennai man = new CommonManInChennai();
		man.goByBicycle();
		man.goByDieselVehicle();
	}
	public void goByBicycle()
	{
		System.out.println("Riding bicycle");
	}
	public void goByDieselVehicle()
	{
		System.out.println("Riding car");
	}

}
