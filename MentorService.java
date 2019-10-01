package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorService {
	
	@Autowired
	private MentorRepository mr;
	
	public List<Mentor> getMentor(){
		List<Mentor> ls=new ArrayList<>();
		mr.findAll().forEach(ls::add);
		return ls;
	}

	public Mentor getMentor(Integer id) {
		return mr.findById(id).orElse(null);
	}
	
	public void addMentor(Mentor s) {
		mr.save(s);
	}
	
	public void updateMentor(Mentor s) {
		mr.save(s);
	}
	
	public void deleteMentor(Integer id) {
		mr.deleteById(id);
	}
}
