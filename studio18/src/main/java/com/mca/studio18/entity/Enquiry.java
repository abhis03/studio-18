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
@Table(name="enquiry")

public class Enquiry {
	
	@Column(name="enquiry_id")
	private Long enquiryid;
	
	@Column(name="enquiry_firstname")
	private String enquiryfirstname;
	
	@Column(name="enquiry_lastname")
	private String enquirylastname;
	
	@Column(name="enquiry_date")
	private String enquirydate;
	
	@Column(name="enquiry_type")
	private String enquirytype;
	
	@Column(name="enquiry_remark")
	private String enquiryremark;
	
	@Column(name="enquiry_package")
	private Long enquirypackage;
	
	@Column(name="booking_date")
	private String bookingdate;
	
	@Column(name="booking_place")
	private String bookingplace;

}
