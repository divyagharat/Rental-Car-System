package com.bikeRentalProjectApplication;

import java.util.ArrayList;
import java.util.List;



public class BikeRentalSystem {
    private List<Bike> bikeList;

    public BikeRentalSystem() {
        this.bikeList = new ArrayList<>();
    }

    public void addBike(Bike bike) {
        bikeList.add(bike);
    }

    public void rentBike(String bikeId) {
        for (Bike bike : bikeList) {
            if (bike.getBikeId().equals(bikeId)) {
                bike.rent();
                return;
            }
        }
        System.out.println("Bike not found with ID: " + bikeId);
    }

    public void returnBike(String bikeId) {
        for (Bike bike : bikeList) {
            if (bike.getBikeId().equals(bikeId)) {
                bike.returnBike();
                return;
            }
        }
        System.out.println("Bike not found with ID: " + bikeId);
    }

    public void viewBikeList() {
        System.out.println("Bike List:");
        for (Bike bike : bikeList) {
            System.out.println(bike);
        }
    }

    public void updateBikeDetails(String bikeId, String brand, String model) {
        for (Bike bike : bikeList) {
        	
            if (bike.getBikeId().equals(bikeId)) {
            	try {
                bike.setAvailable(true);  // Set bike available in case it was rented before updating details
                bike.setBrand(brand);
                bike.setModel(model);
            	} catch (IllegalArgumentException e) {
                    System.out.println("Error updating bike details: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Bike not found with ID: " + bikeId);
    }

    
    
    public List<Bike> getBikeList() {
        return bikeList;
    }
	
	}
