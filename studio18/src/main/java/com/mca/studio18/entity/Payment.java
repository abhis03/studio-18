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
@Table(name="payment")

public class Payment {
	
	@Column(name="payment_id")
	private Long paymentid;
	
	@Column(name="total_payment")
	private Long totalpayment;
	
	@Column(name="payment_paid")
	private Long paymentpaid;
	
	@Column(name="payment_pending")
	private Long paymentpending;
	
	@Column(name="payment_remark")
	private String paymentremark;
	
	@Column(name="booking_id")
	private Long bookingid;
	
	@Column(name="user_id")
	private Long userid;
	
}
