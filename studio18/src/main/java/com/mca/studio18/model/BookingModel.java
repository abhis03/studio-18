package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BookingModel {
	
	public int bookingid;
	public String firstname;
	public String lastname;
	public String mobilenumber;
	public String address;
	public String emailid;
	public int bookingpayment;
	public String functionplace;
	public int bookingdate;
	public int userid;
	public int paymentid;
	public String bookingtype;

}
