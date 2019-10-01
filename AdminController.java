package com.example.demo.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {
	
	@Autowired
	private AdminService as;
	
	@RequestMapping("/ad")
	public List<Admin> getAdmin()
	{
		return as.getAdmin();
	}
	
	@RequestMapping("/{id}")
	public Admin getAdmin(@PathVariable Integer id )
	{
		return as.getAdmin(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/signup")
	public void addAdmin(@RequestBody Admin s)
	{
		as.addAdmin(s);
	} 
	
	@RequestMapping(method=RequestMethod.POST)
	public void updateAdmin(@RequestBody Admin s)
	{
		as.updateAdmin(s);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/delete/{id}")
	public void deleteAdmin(@PathVariable Integer id)
	{
		as.deleteAdmin(id);
	}
}
