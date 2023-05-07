package com.kindsonthegenius.service;

import java.util.List;
import java.util.Optional;

import com.kindsonthegenius.model.student;

public interface getallservice {

	List<student> getall();

	Optional<student> getone(long id);

	void addnew(student student);

	void update(student student);

	void delete(long id);

}