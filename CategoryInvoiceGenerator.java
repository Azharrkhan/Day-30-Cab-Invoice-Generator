package com.bl.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

import com.bl.cabinvoicegenerator.Ride.RideCategory;

public class CategoryInvoiceGenerator {
	private Map<String, Ride[]> rideArchive = new HashMap<>();

	public double calculateFare(double distance, int time, RideCategory category) {
		double fare = (distance * category.minCostPerKm + time * category.minCostPerMin);
		return Math.max(fare, category.minFare);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double fareTotal = 0;
		for (Ride ride : rides) {
			fareTotal += this.calculateFare(ride.getDistance(), ride.getTime(), ride.getRideCategory());
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
