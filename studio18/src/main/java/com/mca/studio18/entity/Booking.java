package com.mca.studio18.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="booking")
public class Booking {
	
	@Column(name="booking_id")
	private Long bookingid;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="mobile_number")
	private String mobilenumber;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email_id")
	private String emailid;
	
	@Column(name="booking_payment")
	private Long bookingpayment;
	
	@Column(name="booking_date")
	private Long bookingdate;
	
	@Column(name="function_place")
	private String functionplace;
	
	@Column(name="booking_type")
	private String bookingtype;
	
	@Column(name="user_id")
	private Long userid;
	
	@Column(name="payment_id")
	private Long paymentid;

}
