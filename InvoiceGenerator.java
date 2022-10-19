package com.bl.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {
	private static final double minCostPerKm = 10;
	private static final int costPerMin = 1;
	private static final double minFare = 5;
	private Map<String, Ride[]> rideArchive = new HashMap<>();

	public double calculateFare(double distance, int time) {
		double fare = (distance * minCostPerKm + time * costPerMin);
		return Math.max(fare, minFare);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double fareTotal = 0;
		for (Ride ride : rides) {
			fareTotal += this.calculateFare(ride.getDistance(), ride.getTime());
		}
		return new InvoiceSummary(rides.length, fareTotal, fareTotal);
	}

	public void addRides(String userID, Ride rides[]) {
		rideArchive.put(userID, rides);
	}

	public InvoiceSummary getRides(String userID) {
		return calculateFare(rideArchive.get(userID));
	}
}
