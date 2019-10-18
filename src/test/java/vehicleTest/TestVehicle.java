package test.java.vehicleTest;

import com.company.Bike;
import com.company.Car;
import com.company.CostCalculate;
import com.company.Truck;
import org.junit.Test;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class TestVehicle {
    Car car = new Car(150, 200);
    Truck truck = new Truck(300, 2000);
    Bike bike = new Bike(200, 80);
    CostCalculate costVehicle = new CostCalculate(1);


    @Test
    public void testCarCost() {
        assertEquals(8950, car.calculateCosts());
    }

    @Test
    public void testTruckCost() {
        assertEquals(58600, truck.calculateCosts());
    }

    @Test
    public void testBikeCost() {
        assertEquals(8120, bike.calculateCosts());
    }

    @Test
    public void testSwitch() {
        assertEquals(58600, costVehicle.vehicleCost());
    }

}
