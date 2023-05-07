package com.kindsonthegenius.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.model.student;
import com.kindsonthegenius.repository.studentrepos;
import com.kindsonthegenius.service.getallservice;

@Service
public class getallimpl implements getallservice {

	@Autowired
	studentrepos studentrepos;

	@Override
	public List<student> getall() {
		return studentrepos.findAll();
	}

	public Optional<student> getone(long id) {

		return studentrepos.findById(id);
	}

	public void addnew(student student) {
		studentrepos.save(student);
		studentrepos.flush();
	}

	public void update(student student) {
		studentrepos.save(student);
	}

	public void delete(long id) {
		studentrepos.deleteById(id);
	}

}
