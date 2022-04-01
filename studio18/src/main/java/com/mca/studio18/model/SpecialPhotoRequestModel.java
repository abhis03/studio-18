package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class SpecialPhotoRequestModel {
	
	public int requestid;
	public String requesttype;
	public String firstname;
	public String lastname;
	public int requestamount;
	public String requestdate;
	public String requestremark;
	

}
