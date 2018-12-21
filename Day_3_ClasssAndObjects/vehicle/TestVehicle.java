/**
 * 
 */


package vehicle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicle {

	@Test
	public void test() {
		Vehicle vehicle = new Vehicle("Ankita");
		System.out.println(vehicle);
		vehicle.setCurrentSpeed(50);
		//vehicle.getCurrentSpeed();
		vehicle.changeSpeed(20);
		vehicle.stopVehicle();
		
		Vehicle vehicleTwo = new Vehicle();
		System.out.println(vehicleTwo);
	}

}
