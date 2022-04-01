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
@Table(name="specialphotorequest")

public class SpecialPhotoRequest {
	
	@Column(name="request_id")
	private Long requestid;
	
	@Column(name="request_type")
	private String requesttype;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="request_amount")
	private Long requestamount;
	
	@Column(name="request_date")
	private String requestdate;
	
	@Column(name="request_remark")
	private String requestremark;
	
}
