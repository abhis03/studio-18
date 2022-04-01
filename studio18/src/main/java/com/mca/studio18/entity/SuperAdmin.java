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
@Table(name="superadmin")
public class SuperAdmin {
	
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="mobile_number")
	private String mobilenumber;
	
	@Column(name="address")
	private String address;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="experience")
	private Long experience;
	
	@Column(name="speciality")
	private String speciality;
	
	@Column(name="charges")
	private Long charges;
	
	@Column(name="email_id")
	private String emailid;
	
	@Column(name="password")
	private String password;
	
	@Column(name="login_id")
	private Long loginid;

}
