package com.company;

public class Truck extends Vehicle   {

    public Truck(int kms, int weight) {
        super(kms, weight);
    }

    @Override
    public int fuelCost() {
        return 10 * getKms() + 3 * getWeight();
    }

    @Override
    public int maintenanceCost() {
        return 2 * getKms() + getWeight() * getWeight()/100;
    }


}
