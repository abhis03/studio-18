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
@Table(name="package")

public class Package {
	
	@Column(name="package_id")
	private Long packageid;
	
	@Column(name="package_name")
	private String packagename;
	
	@Column(name="package_content")
	private String packagecontent;
	
	@Column(name="package_payment")
	private Long packagepayment;
	
	@Column(name="package_remark")
	private String packageremark;
	
	@Column(name="package_discount")
	private String packagediscount;

}
