package com.company;

public class Bike extends Vehicle  {

    public Bike(int kms, int weight) {
        super(kms, weight);
    }

    @Override
    public int fuelCost() {
        return 7 * getKms() + getWeight();
    }

    @Override
    public int maintenanceCost() {
        return 2 * getKms() * getWeight()/50;
    }


}
