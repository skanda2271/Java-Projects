package com.parkinglot.parkinglot.vehicle.parkinglots;

import com.parkinglot.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
	private int spotNumber;
	private boolean isOccupied;
	private Vehicle vehicle;
	private String spotType;
	
	public ParkingSpot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingSpot(int spotNumber,  String spotType) {
		super();
		this.spotNumber = spotNumber;
		this.isOccupied = false;
		this.spotType = spotType;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getSpotType() {
		return spotType;
	}

	public void setSpotType(String spotType) {
		this.spotType = spotType;
	}
	
	public abstract boolean canPark(Vehicle vehicle);
	
	public void parkVehicle(Vehicle vehicle) {
		if(isOccupied) {
			throw new IllegalStateException("Spot is already Occupied");
		}
		if(!canPark(vehicle)) {
			throw new IllegalArgumentException("This spot is not suitable for" + vehicle.getVehicleType());
		}
		this.vehicle = vehicle;
		this.isOccupied = true;
	}
	
	public void vacate() {
		if(!isOccupied) {
			throw new IllegalStateException("Spot is Already Vacant");
		}
		this.vehicle = null;
		this.isOccupied = false;
	}
	
	
	
	

}
