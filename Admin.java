package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue
	@Column(name="actor_id")
	private Integer actorId;
	

	@Column(name="actor_email")
	private String actorEmail;
	@Column(name="actor_password")
	private String actorPassword;
	@Column(name="actor_type")
	private String actorType;
	@Column(name="actor_status")
	private Boolean actorStatus;
	
	@OneToOne(targetEntity=Trainee.class)
	@JoinColumn(name="user_id")
	private Trainee userDetails;
	
	@OneToOne(targetEntity=Mentor.class)
	@JoinColumn(name="mentor_id")
	private Mentor mentorDetails;
	

	public Admin() {
		super();
	}


	public Admin(String actorEmail, String actorPassword, String actorType, Boolean actorStatus) {
		super();
		this.actorEmail = actorEmail;
		this.actorPassword = actorPassword;
		this.actorType = actorType;
		this.actorStatus = actorStatus;
	}

	public void setMentorDetails(Mentor mentorDetails) {
		this.mentorDetails = mentorDetails;
	}
	public void setUserDetails(Trainee userDetails) {
		this.userDetails = userDetails;
	}

	public Integer getId() {
		return actorId;
	}

	public String getActorEmail() {
		return actorEmail;
	}


	public void setActorEmail(String actorEmail) {
		this.actorEmail = actorEmail;
	}


	public String getActorPassword() {
		return actorPassword;
	}


	public void setActorPassword(String actorPassword) {
		this.actorPassword = actorPassword;
	}


	public String getActorType() {
		return actorType;
	}


	public void setActorType(String actorType) {
		this.actorType = actorType;
	}


	public Boolean getActorStatus() {
		return actorStatus;
	}


	public void setActorStatus(Boolean actorStatus) {
		this.actorStatus = actorStatus;
	}
	
}
