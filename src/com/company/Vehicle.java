package com.company;

public abstract class Vehicle {
    private int kms;
    private int weight;

    public Vehicle(int kms, int weight) {
        this.kms = kms;
        this.weight = weight;
    }

    protected abstract int fuelCost();
    protected abstract int maintenanceCost();

    public int driverCost(){
        return 30 * getKms();
    };

    public int getKms() {
        return kms;
    }

    public int getWeight() {
        return weight;
    }



    public int calculateCosts(){
        return fuelCost() + maintenanceCost() + driverCost();
    }


}
