package com.kindsonthegenius.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.model.student;
import com.kindsonthegenius.service.getallservice;

@Controller
@RequestMapping("/student")
public class studentcontroller {

	@Autowired
	getallservice studentservice;

	@RequestMapping("/getall")
	public String getall(Model model) {
		List<student> students = studentservice.getall();
		model.addAttribute("students", students);
		return "students";

	}

	@RequestMapping("/getone")
	@ResponseBody
	public Optional<student> getone(long id) {
		return studentservice.getone(id);
	}

	@PostMapping("/addnew")
	public String addnew(student student) {
		studentservice.addnew(student);
		return "redirect:/student/getall";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(student student) {
		studentservice.update(student);
		return "redirect:/student/getall";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(long id) {
		studentservice.delete(id);
		return "redirect:/student/getall";
	}
}
