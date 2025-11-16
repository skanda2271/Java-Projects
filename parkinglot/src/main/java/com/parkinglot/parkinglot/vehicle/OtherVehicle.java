package com.parkinglot.parkinglot.vehicle;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class OtherVehicle extends Vehicle{
	public OtherVehicle(String lisencePLate, String vehicleType, ParkingFeeCalculation parkingFeeStrategy) {
		super(lisencePLate,vehicleType,parkingFeeStrategy);
	}
}
