package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRepository tr;
	
	public List<Trainee> getTrainee(){
		List<Trainee> ls=new ArrayList<>();
		tr.findAll().forEach(ls::add);
		return ls;
	}

	public Trainee getTrainee(Integer id) {
		return tr.findById(id).orElse(null);
	}
	
	public void addTrainee(Trainee s) {
		tr.save(s);
	}
	
	public void updateTrainee(Trainee s) {
		tr.save(s);
	}
	
	public void deleteTrainee(Integer id) {
		tr.deleteById(id);
	}
}
