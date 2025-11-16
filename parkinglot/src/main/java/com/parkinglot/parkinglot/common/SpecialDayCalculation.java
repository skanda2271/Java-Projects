package com.parkinglot.parkinglot.common;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class SpecialDayCalculation implements ParkingFeeCalculation {
	@Override
	public double calculate(String vehicleType, int duration, CommonEnum durationType) {
		switch (vehicleType.toLowerCase()) {
		case "car":
			return durationType == CommonEnum.HOURS ? duration * 80 : duration * 80 * 24;

		case "bike":
			return durationType == CommonEnum.HOURS ? duration * 60 : duration * 60 * 24;

		case "others":
			return durationType == CommonEnum.HOURS ? duration * 60 : duration * 60 * 24;
		default:
			return durationType == CommonEnum.HOURS ? duration * 80 : duration * 80 * 24;
		}

	}
}
