package com.lachlanlindsay.cs.List.LinkedList.Singly;

public class Car {

    private String numberPlate;
    private String model;

    public Car(String numberPlate, String model) {
        this.numberPlate = numberPlate;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberPlate='" + numberPlate + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
