package com.parkinglot.parkinglot.common;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class NormalDayCalculation implements ParkingFeeCalculation {

	@Override
	public double calculate(String vehicleType, int duration, CommonEnum durationType) {
		switch (vehicleType.toLowerCase()) {
		case "car":
			return durationType == CommonEnum.HOURS ? duration * 50 : duration * 50 * 24;

		case "bike":
			return durationType == CommonEnum.HOURS ? duration * 30 : duration * 30 * 24;

		case "others":
			return durationType == CommonEnum.HOURS ? duration * 40 : duration * 40 * 24;
		default:
			return durationType == CommonEnum.HOURS ? duration * 50 : duration * 50 * 24;
		}

	}
}
