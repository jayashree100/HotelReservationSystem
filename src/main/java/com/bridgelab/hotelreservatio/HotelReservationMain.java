package com.bridgelab.hotelreservatio;

public class HotelReservationMain {
	public static void main(String[] args) {
		System.out.println("WelCome To HotelReservation System");
		HotelReservation hotelResrvation = new HotelReservation();
		hotelResrvation.addHotel("pooja", 3, 110.0, 90.0, 80.0, 80.0);
		hotelResrvation.printHotelList();
		System.out.println(hotelResrvation.getHotelListSize());
		System.out.println(hotelResrvation.getHotelList());

	}
}
