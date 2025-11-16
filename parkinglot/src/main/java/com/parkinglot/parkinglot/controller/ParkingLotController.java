package com.parkinglot.parkinglot.controller;

import java.util.List;

import com.parkinglot.parkinglot.vehicle.Vehicle;
import com.parkinglot.parkinglot.vehicle.parkinglots.ParkingSpot;

public class ParkingLotController {
	private List<ParkingSpot> spots;


	public ParkingLotController(List<ParkingSpot> spots) {
		super();
		this.spots = spots;
	}

	public List<ParkingSpot> getSpots() {
		return spots;
	}

	public void setSpots(List<ParkingSpot> spots) {
		this.spots = spots;
	}
	
	public ParkingSpot getSpotByNumber(int spotNum) {
		for(ParkingSpot spot : spots) {
			if(spot.getSpotNumber() == spotNum) {
				return spot;
			}
		}
		return null;
	}
	
	public ParkingSpot findAvailableSpot(String vehicleType) {
		for(ParkingSpot spot : spots) {
			if(!spot.isOccupied() && spot.getSpotType().equals(vehicleType)) {
				return spot;		
			}
		}
		return null;
	}
	
	public ParkingSpot parkVehicle(Vehicle vehicle) {
		ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
		if(spot != null) {
			spot.parkVehicle(vehicle);
			System.out.println("Vehicle Parked at" + spot.getSpotNumber());
			return spot;
		}
		System.out.println("No parking Space found");
		return null;
	}
	
	public void vacate(ParkingSpot spot, Vehicle vehicle) {
		if(spot != null && spot.isOccupied() && spot.getVehicle().equals(vehicle)) {
			spot.vacate();
			System.out.println("Vehicle Vacated at" + spot.getSpotNumber());
		}
		else {
			System.out.println("Not Free"+spot.getSpotNumber());
		}
	}

}
