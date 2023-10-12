package com.bikeRentalProjectApplication;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BikeRentalSystem rentalSystem = new BikeRentalSystem();

	        // Creating Bikes
	        Bike bike1 = new Bike("B001", "Honda", "CBR");
	        Bike bike2 = new Bike("B002", "Yamaha", "R1");

	        // Adding bikes to the rental system
	        rentalSystem.addBike(bike1);
	        rentalSystem.addBike(bike2);
	        
	        Bike bike3 = new Bike("B003", "Suzuki", "GSXR");
	        Bike bike4 = new Bike("B004", "Kawasaki", "Ninja");

	        
	        rentalSystem.addBike(bike3);
	        rentalSystem.addBike(bike4);
	        
	        rentalSystem.viewBikeList();

	        int choice;
	        boolean continueLoop = true;
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Add a Bike");
	            System.out.println("2. Update a Bike");
	            System.out.println("3. View Bike List");
	            System.out.println("4. Return a bike");
	            System.out.println("5. Rent a Bike");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            choice = scanner.nextInt();
	        
	            switch (choice) {
	            case 1:
	                // Add Bike
	                System.out.print("Enter Bike ID: ");
	                String bikeId = scanner.next();
	                System.out.print("Enter Brand: ");
	                String brand = scanner.next();
	                System.out.print("Enter Model: ");
	                String model = scanner.next();

	                Bike newBike = new Bike(bikeId, brand, model);
	                rentalSystem.addBike(newBike);
	                System.out.println("Bike added successfully!");
	                break;
	                
	            case 2:
	                // Update Bike Details
	                System.out.print("Enter Bike ID to update details: ");
	                String updateBikeId = scanner.next();
	                System.out.print("Enter New Brand: ");
	                String updateBrand = scanner.next();
	                System.out.print("Enter New Model: ");
	                String updateModel = scanner.next();

	                rentalSystem.updateBikeDetails(updateBikeId, updateBrand, updateModel);
	                break;
	                
	                case 3:
	                	 rentalSystem.viewBikeList();
		                    break;
	                   

	                case 4:
	                    // Return a Bike
	                    System.out.print("Enter Bike ID to return: ");
	                    String returnBikeId = scanner.next();
	                    rentalSystem.returnBike(returnBikeId);
	                    rentalSystem.viewBikeList();
	                    break;

	                case 5:
	                	 // Rent a Bike
	                    System.out.print("Enter Bike ID to rent: ");
	                    String rentBikeId = scanner.next();
	                    rentalSystem.rentBike(rentBikeId);
	                    rentalSystem.viewBikeList();
	                    break;

	                case 6:
	                    // Exit
	                    System.out.println("Thank you. Visit Again!");
	                    continueLoop = false;
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }

	 } while (continueLoop);
	        
	        /*System.out.println("Do you want to continue? (1. Yes / 2. No)");
	        int continueChoice = scanner.nextInt();
	        if (continueChoice == 1) {
	            // Reset the choice to continue the loop
	            choice = 0;*/
	        
	        scanner.close();
	    
      
    }

}
