package MOOCFI2.Part11.Packages.FlightControl.logic;

import MOOCFI2.Part11.Packages.FlightControl.domain.Airport;
import MOOCFI2.Part11.Packages.FlightControl.domain.Flight;
import MOOCFI2.Part11.Packages.FlightControl.domain.Plane;

import java.util.HashMap;


public class FlightControl {


    private HashMap<String, Plane> planes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Airport> airports;

    public FlightControl() {
        this.planes = new HashMap();
        this.flights = new HashMap();
        this.airports = new HashMap();
    }

    public void addPlane(String id, int capacity) {
        this.planes.putIfAbsent(id, new Plane(id, capacity));
    }

    public Plane getPlane(String id) {
        return this.planes.get(id);
    }

    public void printPlanes() {
        for (Plane plane : this.planes.values()) {
            System.out.println(plane.toString());
        }
    }

    public void addFlight(Plane plane, String departure, String destination) {
        this.airports.putIfAbsent(departure, new Airport(departure));
        this.airports.putIfAbsent(destination, new Airport(destination));

        Flight flight = new Flight(plane, this.airports.get(departure), this.airports.get(destination));

        this.flights.putIfAbsent(flight.toString(), flight);
    }

    public void printFlights() {
        for (Flight flight : this.flights.values()) {
            System.out.println(flight.toString());
        }
    }
}

