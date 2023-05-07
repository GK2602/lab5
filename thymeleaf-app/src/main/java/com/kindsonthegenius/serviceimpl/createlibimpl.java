package com.kindsonthegenius.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.model.student;
import com.kindsonthegenius.repository.studentrepos;
import com.kindsonthegenius.service.createservice;

@Service
public class createlibimpl implements createservice {

	@Autowired
	studentrepos studentrepos;
	
	@Override
	public String createlib(student student) {
		studentrepos.save(student);
		studentrepos.flush();
		return "created";
	}
}
