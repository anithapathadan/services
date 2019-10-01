package com.example.demo.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/trainee")
@RestController
public class TraineeController {
	
	@Autowired
	private TraineeService ts;
	
	@RequestMapping("/ad")
	public List<Trainee> getTrainee()
	{
		return ts.getTrainee();
	}
	
	@RequestMapping("/{id}")
	public Trainee getTrainee(@PathVariable Integer id )
	{
		return ts.getTrainee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/signup")
	public void addTrainee(@RequestBody Trainee s)
	{
		ts.addTrainee(s);
	} 
	
	@RequestMapping(method=RequestMethod.POST,value="/update/{id}")
	public void updateTrainee(@RequestBody Trainee s)
	{
		ts.updateTrainee(s);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/delete/{id}")
	public void deleteTrainee(@PathVariable Integer id)
	{
		ts.deleteTrainee(id);
	}
}

