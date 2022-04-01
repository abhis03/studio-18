package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EnquiryModel {
	
	public int enquiryid;
	public String enquiryfirstname;
	public String enquirylastname;
	public String enquirydate;
	public String enquirytype;
	public String enquiryremark;
	public int enquirypackage;
	public String bookingdate;
	public String bookingplace;

}
