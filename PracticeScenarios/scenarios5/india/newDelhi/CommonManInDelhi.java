package scenarios5.india.newDelhi;

import scenarios5.tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInDelhi man = new CommonManInDelhi();
		man.goByBicycle();
		man.dontGoByDieselVehicle();
		man.goByDieselVehicle();
	}
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("No Riding by car");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("Ride bicycle");		
	}

	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Ride Car");
	}
}
