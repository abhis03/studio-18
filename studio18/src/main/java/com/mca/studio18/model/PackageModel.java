package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PackageModel {
	
	public int paymentid;
	public int totalpayment;
	public int paymentpaid;
	public int paymentpending;
	public String paymentremark;
	public int bookingid;

}
