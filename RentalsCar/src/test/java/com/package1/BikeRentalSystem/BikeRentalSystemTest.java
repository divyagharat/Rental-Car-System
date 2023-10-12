package com.package1.BikeRentalSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bikeRentalProjectApplication.Bike;
import com.bikeRentalProjectApplication.BikeRentalSystem;
import com.bikeRentalProjectApplication.Main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeRentalSystemTest {

    private BikeRentalSystem rentalSystem;
    private Bike bike1;
    private Bike bike2;

    @BeforeEach
    public void setUp() {
        rentalSystem = new BikeRentalSystem();
        bike1 = new Bike("B001", "Honda", "CBR");
        bike2 = new Bike("B002", "Yamaha", "R1");
        rentalSystem.addBike(bike1);
        rentalSystem.addBike(bike2);
    }

    @Test
    public void testAddBike() {
        assertEquals(2, rentalSystem.getBikeList().size());
        Bike newBike = new Bike("B003", "Suzuki", "GSXR");
        rentalSystem.addBike(newBike);
        assertEquals(3, rentalSystem.getBikeList().size());
    }

    @Test
    public void testUpdateBikeDetails() {
        rentalSystem.updateBikeDetails("B001", "Suzuki", "GSXR");
        assertEquals("Suzuki", bike1.getBrand());
        assertEquals("GSXR", bike1.getModel());
        assertTrue(bike1.isAvailable());
    }

    @Test
    public void testUpdateBikeDetailsNotFound() {
        rentalSystem.updateBikeDetails("B002", "Suzuki", "GSXR");
        assertFalse(bike1.getBrand().equals("Suzuki"));
        assertFalse(bike1.getModel().equals("GSXR"));
    }

    // Add more tests as needed

}





