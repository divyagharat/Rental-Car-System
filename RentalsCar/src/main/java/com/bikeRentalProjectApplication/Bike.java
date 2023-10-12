package com.bikeRentalProjectApplication;

public class Bike {
    private String bikeId;
    private String brand;
    private String model;
    private boolean available;

    public Bike(String bikeId, String brand, String model) {
        this.bikeId = bikeId;
        this.brand = brand;
        this.model = model;
        this.available = true;
    }

    public String getBikeId() {
        return bikeId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
        public void setBrand(String brand) {
        	if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }  else {
        	throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        	}

        public void setModel(String model) {
        	if (model != null && !model.isEmpty()) {
            this.model = model;
        	 } else {
        		 throw new IllegalArgumentException("Model cannot be null or empty.");
             }
        	 }
        
        public void rent() {
            if (available) {
                available = false;
                System.out.println("Bike rented successfully.");
            } else {
                System.out.println("Bike is not available for rent.");
            }
        }

        public void returnBike() {
            available = true;
            System.out.println("Bike returned successfully.");
        }

    @Override
    public String toString() {
        return "Bike ID: " + bikeId + ", Brand: " + brand + ", Model: " + model + ", Available: " + available;
        
        
        

      

    }
}
