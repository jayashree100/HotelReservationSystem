package com.bridgelab.hotelreservatio;

public class Hotel {
	private String hotelName;
	private int rating;
	private double weekdayRate;
	private double weekendRate;
	private double weekdayRewardsCustomerRate;
	private double weekendRewardsCustomerRate;

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", weekDayRate=" + weekdayRate
				+ ", weekEndRate=" + weekendRate + ", weekdayRewardsCustomerRate=" + weekdayRewardsCustomerRate
				+ ", weekendRewardsCustomerRate=" + weekendRewardsCustomerRate + "]";
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getWeekDayRate() {
		return weekdayRate;
	}

	public void setWeekDayRate(double weekDayRate) {
		this.weekdayRate = weekDayRate;
	}

	public double getWeekEndRate() {
		return weekendRate;
	}

	public void setWeekEndRate(double weekEndRate) {
		this.weekendRate = weekEndRate;
	}

	public double getWeekdayRewardsCustomerRate() {
		return weekdayRewardsCustomerRate;
	}

	public void setWeekdayRewardsCustomerRate(double weekdayRewardsCustomerRate) {
		this.weekdayRewardsCustomerRate = weekdayRewardsCustomerRate;
	}

	public double getWeekendRewardsCustomerRate() {
		return weekendRewardsCustomerRate;
	}

	public void setWeekendRewardsCustomerRate(double weekendRewardsCustomerRate) {
		this.weekendRewardsCustomerRate = weekendRewardsCustomerRate;
	}

	public Hotel(String hotelName, int rating, double weekDayRate, double weekEndRate,
			double weekdayRewardsCustomerRate, double weekendRewardsCustomerRate) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRate = weekDayRate;
		this.weekendRate = weekEndRate;
		this.weekdayRewardsCustomerRate = weekdayRewardsCustomerRate;
		this.weekendRewardsCustomerRate = weekendRewardsCustomerRate;
	}

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

}
