package com.example.demo.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
	
	@Id
	@GeneratedValue
	@Column(name="payment_id")
	private Integer paymentId;
	@Column(name="payment_date")
	private Date paymentDate;
	@Column(name="paid_amount")
	private Float paidAmount;
	
//	@ManyToOne(targetEntity=TrainingsEntity.class)
//	@JoinColumn(name="training_id")
//	private TrainingsEntity training;
	
//	public void setTraining(TrainingsEntity training) {
//		this.training = training;
//	}

	public Payment() {
		super();
	}

	public Payment(Date paymentDate, Float paidAmount) {
		super();
		this.paymentDate = paymentDate;
		this.paidAmount = paidAmount;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Float paidAmount) {
		this.paidAmount = paidAmount;
	}

}
