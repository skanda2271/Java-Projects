package com.parkinglot.parkinglot.vehicle.parkinglots;

import com.parkinglot.parkinglot.vehicle.Vehicle;

public class BikeParkingSpot extends ParkingSpot {
	public BikeParkingSpot(int spotNumber, String spotType) {
		super(spotNumber , spotType);
	}

	@Override
	public boolean canPark(Vehicle vehicle) {
		return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
		
	}


}
