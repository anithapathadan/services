package com.example.demo.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_skills")
public class MentorSkillsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mentor_skill_id")
	private Integer mentorSkillId;
	@Column(name="commission")
	private Float commission;
	@Column(name="mentor_fee")
	private Float mentorFee;
	@Column(name="total_fee")
	private Float totalFee;
	@ManyToOne(cascade=CascadeType.ALL)  
	private TechnologiesEntity technology;
	
	public MentorSkillsEntity() {
		super();
	}

	public MentorSkillsEntity(Float commission, Float mentorFee, Float totalFee) {
		super();
		this.commission = commission;
		this.mentorFee = mentorFee;
		this.totalFee = totalFee;
	}

	public void setTechnology(TechnologiesEntity technology) {
		this.technology = technology;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}

	public Float getMentorFee() {
		return mentorFee;
	}

	public void setMentorFee(Float mentorFee) {
		this.mentorFee = mentorFee;
	}

	public Float getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Float totalFee) {
		this.totalFee = totalFee;
	}

}
