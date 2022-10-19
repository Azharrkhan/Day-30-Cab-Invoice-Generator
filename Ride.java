package com.bl.cabinvoicegenerator;

public class Ride {
	public enum RideCategory {
		NORMAL(10, 1, 5), PREMIUM(15, 2, 20);

		public double minCostPerKm;
		public int minCostPerMin;
		public double minFare;

		private RideCategory(double minCostPerKm, int minCostPerMin, double minFare) {
			this.minCostPerKm = minCostPerKm;
			this.minCostPerMin = minCostPerMin;
			this.minFare = minFare;
		}
	}

	private double distance;
	private int time;
	private RideCategory rideCategory;

	public Ride(double distance, int time, RideCategory rideCategory) {
		super();
		this.distance = distance;
		this.time = time;
		this.rideCategory = rideCategory;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public RideCategory getRideCategory() {
		return rideCategory;
	}

	public void setRideCategory(RideCategory rideCategory) {
		this.rideCategory = rideCategory;
	}
}
