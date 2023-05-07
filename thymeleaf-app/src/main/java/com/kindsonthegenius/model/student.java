package com.kindsonthegenius.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class student {
	@Id
	private long id;
	private String employee_firstname;
	private String employee_lastname;
	private String email_id;

}
