package com.bridgelab.hotelreservatio;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class HotelReservation {
	List<Hotel> hotelList = new ArrayList<Hotel>();

	public void addHotel(String hotelName, int rating, double weekdayRate, double weekendRate,
			double weekdayRewardsCustomerRate, double weekendRewardsCustomerRate) {
		Hotel hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotel.setWeekDayRate(weekdayRate);
		hotel.setWeekEndRate(weekendRate);
		hotel.setWeekdayRewardsCustomerRate(weekdayRewardsCustomerRate);
		hotel.setWeekendRewardsCustomerRate(weekendRewardsCustomerRate);

		hotelList.add(hotel);

	}
	
	public int getHotelListSize() {
		return hotelList.size();
	}
	
	public void printHotelList() {
		System.out.println(hotelList);
	}
	
	public List<Hotel> getHotelList() {
		return hotelList;
	}
	
	public String getCheapestHotel(LocalDate startDate,LocalDate endDate,String customerType) {
		String custType = customerType;
		int cheapestRate,rateForHotel;
		return cheapestHotel;
	}

}
