package com.parkinglot.parkinglot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.parkinglot.parkinglot.common.NormalDayCalculation;
import com.parkinglot.parkinglot.common.SpecialDayCalculation;
import com.parkinglot.parkinglot.controller.ParkingLotController;
import com.parkinglot.parkinglot.vehicle.Vehicle;
import com.parkinglot.parkinglot.vehicle.VehicleFactory;
import com.parkinglot.parkinglot.vehicle.parkinglots.CarParkingSpot;
import com.parkinglot.parkinglot.vehicle.parkinglots.ParkingSpot;

@SpringBootApplication
public class ParkinglotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
		System.out.println("Welcome to Parking Lot Systsem");
		List<ParkingSpot> spots = new ArrayList<>();
		spots.add(new CarParkingSpot(1, "car"));
		spots.add(new CarParkingSpot(3, "Car"));
		spots.add(new CarParkingSpot(2, "Bike"));
		spots.add(new CarParkingSpot(4, "bike"));
		spots.add(new CarParkingSpot(1, "Car"));
		spots.add(new CarParkingSpot(3, "Car"));
		
		ParkingLotController parkingLot = new ParkingLotController(spots);
		NormalDayCalculation normal = new NormalDayCalculation();
		SpecialDayCalculation special = new SpecialDayCalculation();
		
		Vehicle car1 = VehicleFactory.createVehicle("Car", "123456", special);
		Vehicle car2 = VehicleFactory.createVehicle("Car", "123456", special);
		Vehicle car3 = VehicleFactory.createVehicle("Car", "123456", normal);
		Vehicle car4 = VehicleFactory.createVehicle("Car", "123456", normal);
		
		Vehicle bike1 = VehicleFactory.createVehicle("Bike", "123456", normal);
		Vehicle bike2 = VehicleFactory.createVehicle("bike", "123456", normal);
		
		ParkingSpot bikespot = parkingLot.parkVehicle(bike2);
		ParkingSpot carspot1 = parkingLot.parkVehicle(car1);
		ParkingSpot carspot2 = parkingLot.parkVehicle(car2);
		ParkingSpot carspot3 = parkingLot.parkVehicle(car3);
		
		
		
		
	}

}
