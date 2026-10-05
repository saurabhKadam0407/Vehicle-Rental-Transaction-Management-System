package utility;

import enums.VehicleStatus;

public abstract class Vehicle {
	private int vehicleNumber;
	private String customerName;
	private double rentalAmount;
	public VehicleStatus status;

	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleNumber, String customerName, double rentalAmount, VehicleStatus status) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.customerName = customerName;
		this.rentalAmount = rentalAmount;
		this.status = status;
	}

	public abstract void calculateRentalCharge();

	public abstract void calculateDiscount();

	public abstract void getVehicleType();

	public double rent() {
		return rentalAmount;
	}

	public void returnVehicle() {
		status = status.INACTIVE;
	}

	public void displayVehicleDetails() {
		System.out.println("Vehicle Number :: " + vehicleNumber);
		System.out.println("Customer Name :: " + customerName);
		System.out.println("Vehicle Rent :: " + rentalAmount);
		System.out.println("Vehicle Status :: " + status);
	}
}
