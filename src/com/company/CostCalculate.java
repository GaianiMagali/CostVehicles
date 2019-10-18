package com.company;

public class CostCalculate {
    int vehicle;

    public CostCalculate(int vehicle) {
        this.vehicle = vehicle;
    }

    public int vehicleCost() {
        int cost = 0;
        switch (vehicle) {
            case 0:
                Car car = new Car(150,200);
                cost = car.calculateCosts();
                break;
            case 1:
                Truck truck = new Truck(300,2000);
                cost = truck.calculateCosts();
                break;
            case 2:
                Bike bike = new Bike(200,80);
                cost = bike.calculateCosts();
                break;
        }
        return cost;
    }

}
