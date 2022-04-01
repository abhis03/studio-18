package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OfferModel {
	
	public int offerid;
	public String offername;
	public String offertype;
	public int offerprice;
	public String content;
	public String offerremark;
	public String offerdate;
	public String offerenddate;
	
}
