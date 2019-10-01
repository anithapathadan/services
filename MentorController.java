package com.example.demo.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mentor")
@RestController
public class MentorController {
	
	@Autowired
	private MentorService ms;
	
	@RequestMapping("/all")
	public List<Mentor> getMentor()
	{
		return ms.getMentor();
	}
	
	@RequestMapping("/{id}")
	public Mentor getMentor(@PathVariable Integer id )
	{
		return ms.getMentor(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/signup")
	public void addMentor(@RequestBody Mentor s)
	{
		ms.addMentor(s);
	} 
	
	@RequestMapping(method=RequestMethod.POST,value="/update/{id}")
	public void updateMentor(@RequestBody Mentor s)
	{
		ms.updateMentor(s);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/delete/{id}")
	public void deleteMentor(@PathVariable Integer id)
	{
		ms.deleteMentor(id);
	}
}


