package com.parkinglot.parkinglot.vehicle;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class Car extends Vehicle {
	public Car(String lisencePLate, String vehicleType, ParkingFeeCalculation parkingFeeStrategy) {
		super(lisencePLate,vehicleType,parkingFeeStrategy);
	}

}
