package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_calender")
public class MentorCalenderEntity {

	@Id
	@GeneratedValue
	@Column(name="calender_id")
	private Integer calenderId;
	@Column(name="time_slot")
	private String timeSlot;
	
	@ManyToOne(targetEntity=Mentor.class)
	@JoinColumn(name="mentor_id")
	private Mentor mentorDetails;

	public MentorCalenderEntity() {
		super();
	}

	public MentorCalenderEntity(String timeSlot, Mentor mentorDetails) {
		super();
		this.timeSlot = timeSlot;
		this.mentorDetails = mentorDetails;
	}

	public Integer getCalenderId() {
		return calenderId;
	}

	public void setCalenderId(Integer calenderId) {
		this.calenderId = calenderId;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Mentor getMentorDetails() {
		return mentorDetails;
	}

	public void setMentorDetails(Mentor mentorDetails) {
		this.mentorDetails = mentorDetails;
	}	
	
}
