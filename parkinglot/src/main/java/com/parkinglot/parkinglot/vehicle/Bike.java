package com.parkinglot.parkinglot.vehicle;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class Bike extends Vehicle{
	public Bike(String lisencePLate, String vehicleType, ParkingFeeCalculation parkingFeeStrategy) {
		super(lisencePLate,vehicleType,parkingFeeStrategy);
	}

}
