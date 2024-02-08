import impl.AutomatedParkingGarage;
import impl.CarParkingSpot;
import impl.GenericVehicle;
import impl.ParkingTicket;
import interfaces.Vehicle;

import java.time.Duration;
import java.time.Instant;

public class AutomaticParking {
    public static void main(String[] args) {
        AutomatedParkingGarage parkingGarage = new AutomatedParkingGarage();

        parkingGarage.addParkingSlot(new CarParkingSpot());
        parkingGarage.addParkingSlot(new CarParkingSpot());

        // Simulate vehicle entering and parking
        Vehicle car = new GenericVehicle("ABCD123", 2);
        long entryTimeStamp = Instant.now().getEpochSecond();
        ParkingTicket ticket = parkingGarage.issueParkingTicket(car, entryTimeStamp);
        parkingGarage.automateParking();

        // Simulate vehicle leaving
        long exitTimeStamp = Instant.now().plus(Duration.ofHours(1)).getEpochSecond();
        ticket.setExitTimeStamp(exitTimeStamp);
        double cost = parkingGarage.calculateParkingCost(ticket);
        parkingGarage.payParkingTicket(ticket,cost);
        parkingGarage.removeVehicle(car);
        parkingGarage.automateVehicleExit();
    }
}
