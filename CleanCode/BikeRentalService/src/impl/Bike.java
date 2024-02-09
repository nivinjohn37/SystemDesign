package impl;

import interfaces.Rentable;

public class Bike implements Rentable {
    private String bikeId;
    private boolean isRented;

    public Bike(String bikeId, boolean isRented){
        this.bikeId = bikeId;
        this.isRented = isRented;
    }

    @Override
    public void rent() {
        if(!isRented){
            isRented = true;
            System.out.println("Rented bikeId: " + bikeId);
        }else{
            System.out.println("Already Rented Bike -> bikeId: " + bikeId);
        }
    }

    @Override
    public boolean isRented() {
        return false;
    }

    @Override
    public void returnItem() {
        if(isRented){
            isRented = false;
            System.out.println("Returned bikeId: " + bikeId);
        }else{
            System.out.println("Not rented bike -> bikeId: " + bikeId);
        }
    }
}
