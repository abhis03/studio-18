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
@Table(name="users")
public class Users {

	@Column(name="user_id")
	private Long userid;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column (name="last_name")
	private String lastname;
	
	@Column(name="type")
	private String type;
	
	@Column(name="address")
	private String address;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column (name="login_id")
	private Long loginid;
	
	@Column (name="booking_id")
	private Long bookingid;
	
}