package ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver dr = new Driver();
		
		Vehicle veh = new Vehicle();
		dr.drive(veh);
		
		Bus b = new Bus();
		dr.drive(b);
		
		Taxi tax = new Taxi();
		dr.drive(tax);
	}
}
