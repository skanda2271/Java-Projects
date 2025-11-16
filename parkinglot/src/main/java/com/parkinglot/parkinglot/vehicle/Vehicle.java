package com.parkinglot.parkinglot.vehicle;

import com.parkinglot.parkinglot.ParkingFeeStrategy.ParkingFeeCalculation;

public class Vehicle {
	private String lisencePLate;
	private String vehicleType;
	private ParkingFeeCalculation parkingFeeStrategy;
	
	public Vehicle(String lisencePLate, String vehicleType, ParkingFeeCalculation parkingFeeStrategy) {
		super();
		this.lisencePLate = lisencePLate;
		this.vehicleType = vehicleType;
		this.parkingFeeStrategy = parkingFeeStrategy;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLisencePLate() {
		return lisencePLate;
	}

	public void setLisencePLate(String lisencePLate) {
		this.lisencePLate = lisencePLate;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ParkingFeeCalculation getParkingFeeStrategy() {
		return parkingFeeStrategy;
	}

	public void setParkingFeeStrategy(ParkingFeeCalculation parkingFeeStrategy) {
		this.parkingFeeStrategy = parkingFeeStrategy;
	}

	@Override
	public String toString() {
		return "Vehicle [lisencePLate=" + lisencePLate + ", vehicleType=" + vehicleType + ", parkingFeeStrategy="
				+ parkingFeeStrategy + "]";
	}

}
