package com.company;

public class Car extends Vehicle  {

    public Car(int kms, int weight) {
        super(kms, weight);
    }

    @Override
    public int fuelCost() {
        return 20 * getKms() + 2 * getWeight();
    }

    @Override
    public int maintenanceCost() {
        return 3 * getKms() + 3 * getWeight();
    }

}
