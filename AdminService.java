package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository ar;
	
	public List<Admin> getAdmin(){
		List<Admin> ls=new ArrayList<>();
		ar.findAll().forEach(ls::add);
		return ls;
	}

	public Admin getAdmin(Integer id) {
		return ar.findById(id).orElse(null);
	}
	public void addAdmin(Admin s) {
		ar.save(s);
	}
	
	public void updateAdmin(Admin s) {
		ar.save(s);
	}
	
	public void deleteAdmin(Integer id) {
		ar.deleteById(id);
	}
}
