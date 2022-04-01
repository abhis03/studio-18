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
@Table(name="offer")

public class Offer {
	
	@Column(name="offer_id")
	private Long offerid;
	
	@Column(name="offer_name")
	private String offername;
	
	@Column(name="offer_type")
	private String offertype;
	
	@Column(name="offer_price")
	private Long offerprice;
	
	@Column(name="content")
	private String content;
	
	@Column(name="offer_remark")
	private String offerremark;
	
	@Column(name="offer_date")
	private String offerdate;
	
	@Column(name="offer_enddate")
	private String offerenddate;

}
