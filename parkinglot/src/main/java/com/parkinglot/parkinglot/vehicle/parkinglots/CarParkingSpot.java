package com.parkinglot.parkinglot.vehicle.parkinglots;

import com.parkinglot.parkinglot.vehicle.Vehicle;

public class CarParkingSpot extends ParkingSpot{

	public CarParkingSpot(int spotNumber, String spotType) {
		super(spotNumber , spotType);
	}

	@Override
	public boolean canPark(Vehicle vehicle) {
		return "Car".equalsIgnoreCase(vehicle.getVehicleType());
		
	}

}
