package com.parkinglot.parkinglot.vehicle;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class VehicleFactory {
	public static Vehicle createVehicle(String lisencePLate, String vehicleType, ParkingFeeCalculation parkingFeeStrategy) {
		if(vehicleType.equalsIgnoreCase("Car")) {
			return new Car(lisencePLate,vehicleType,parkingFeeStrategy);
		}
		else if(vehicleType.equalsIgnoreCase("Bike")) {
			return new Bike(lisencePLate,vehicleType,parkingFeeStrategy);
		}
		else {
			return new OtherVehicle(lisencePLate,vehicleType,parkingFeeStrategy);
		}
	}

}
