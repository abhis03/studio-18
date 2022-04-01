package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AdminModel {
	
	public int id;
	public String firstname;
	public String lastname;
	public String mobilenumber;
	public String address;
	public String designation;
	public int experience;
	public String speciality;
	public int charges;
	public String emailid;
	public String password;
	public int loginid;

}
