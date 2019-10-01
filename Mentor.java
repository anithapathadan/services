package com.example.demo.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_details")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mentor_id")
	private Integer mentorId;
	
	@Column(name="mentor_name")
	private String mentorName;
	@Column(name="mentor_email")
	private String mentorEmail;
	
	@Column(name="alma_mater")
	private String almaMater;
	@Column(name="qualification")
	private String mentorQual;
	@Column(name="mentor_password")
	private String mentorPassword;
	
	@Column(name="mentor_years_exp")
	private Integer mentorYearsExp;
	
	@Column(name="no_of_trainings")
	private Integer trainings;
	
	
	@Column(name="rating")
	private float rating;
	
	@OneToOne(targetEntity=Admin.class,cascade=CascadeType.ALL)
	@JoinColumn(name="actor_id")
	private Admin actor;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="mentor_id")
	private List<MentorSkillsEntity> mentorSkills;
	
	public Mentor() {
		super();
	}

	public Mentor(String mentorName, String mentorEmail,
			Integer mentorYearsExp, String mentorLinkdinUrl, String mentorPhone, Integer trainings) {
		super();
		this.mentorName = mentorName;
		this.mentorEmail = mentorEmail;
		this.mentorYearsExp = mentorYearsExp;
		this.trainings = trainings;
	}

	public void setMentorSkills(List<MentorSkillsEntity> mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	public void setActor(Admin actor) {
		this.actor = actor;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public String getMentorEmail() {
		return mentorEmail;
	}

	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}

	public Integer getMentorYearsExp() {
		return mentorYearsExp;
	}

	public void setMentorYearsExp(Integer mentorYearsExp) {
		this.mentorYearsExp = mentorYearsExp;
	}


	public Integer getTrainings() {
		return trainings;
	}

	public void setTrainings(Integer trainings) {
		this.trainings = trainings;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
