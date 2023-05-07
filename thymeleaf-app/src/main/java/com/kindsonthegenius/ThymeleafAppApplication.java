package com.kindsonthegenius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kindsonthegenius.model.student;
import com.kindsonthegenius.service.createservice;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ThymeleafAppApplication implements CommandLineRunner {

	@Autowired
	createservice createservices;

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		createexecution();

	}

	public void createexecution() {

		log.info("creating library->{}", createservices.createlib(student.builder().id(1l).employee_firstname("gokul")
				.employee_lastname("gudi").email_id("gokulgudi@gmail.com").build()));
		log.info("creating library->{}", createservices.createlib(student.builder().id(2l).employee_firstname("abc")
				.employee_lastname("abc").email_id("gohan123@gmail.com").build()));
		log.info("creating library->{}", createservices.createlib(student.builder().id(3l).employee_firstname("xyz")
				.employee_lastname("zyz").email_id("xyz@gmail.com").build()));
		log.info("creating library->{}", createservices.createlib(student.builder().id(4l).employee_firstname("qqq")
				.employee_lastname("qqq").email_id("qqq@gmail.com").build()));

	}

}
