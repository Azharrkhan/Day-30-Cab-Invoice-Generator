package com.bl.cabinvoicegenerator;

public class InvoiceSummary {
	private int noOfRides;
	private double totalFare;
	private double fareAverage;

	public InvoiceSummary(int noOfRides, double totalFare, double fareAverage) {
		super();
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.fareAverage = fareAverage;
	}

	public int getNoOfRides() {
		return noOfRides;
	}

	public void setNoOfRides(int noOfRides) {
		this.noOfRides = noOfRides;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public double getFareAverage() {
		return fareAverage;
	}

	public void setFareAverage(double fareAverage) {
		this.fareAverage = fareAverage;
	}
}
