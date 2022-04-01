package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersModel {

	public int userid;
	public String firstname;
	public String lastname;
	public String type;
	public String address;
	public String mobileNumber;
	public String emailId;
	public String loginid;
	public String bookingid;
}