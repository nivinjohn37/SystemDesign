package impl;

import interfaces.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingGarage {
    private List<ParkingTicket> parkingTicketList;
    private List<ParkingSpot> parkingSpotList;

    public ParkingGarage(){
        parkingSpotList = new ArrayList<>();
        parkingTicketList = new ArrayList<>();
    }


}
