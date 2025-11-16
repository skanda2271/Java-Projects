package com.parkinglot.parkinglot.ParkingFeeStrategy;

import com.parkinglot.parkinglot.common.CommonEnum;

public interface ParkingFeeCalculation {
	double calculate(String vehicleType,int duration, CommonEnum durationType);

}
