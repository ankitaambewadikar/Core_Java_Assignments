package vehicle;

import javax.jws.Oneway;

public class Vehicle {

	private double currentSpeed;
	private String ownerName;
	private double currentDirection;
	private String[] directionsArray = {"North" ,"South"};
	private int vehicleId;
	private static int highestVehicleIdentificationNumber = 0;
	
	Vehicle( ){
		vehicleId = ++highestVehicleIdentificationNumber;
		highestVehicleIdentificationNumber = highestVehicleIdentificationNumber > vehicleId ? highestVehicleIdentificationNumber : vehicleId;

	}
	
	Vehicle(String ownerName){
		this.ownerName = ownerName;
		vehicleId = ++highestVehicleIdentificationNumber;
		highestVehicleIdentificationNumber = highestVehicleIdentificationNumber > vehicleId ? highestVehicleIdentificationNumber : vehicleId;
		
		
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed =(( this.currentSpeed + currentSpeed) <=180 && (this.currentSpeed + currentSpeed) >=0)? this.currentSpeed+currentSpeed:0;
	}

	public double getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", vehicleId=" + vehicleId
				+ "]";
	}

	public void changeSpeed(double changedSpeed) {
		this.currentSpeed = (this.currentSpeed + changedSpeed);
		System.out.println(this.currentSpeed);
	}

	public void stopVehicle() {
		currentSpeed=0;
		}


	
	
	
	
}
