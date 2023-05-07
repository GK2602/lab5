package com.kindsonthegenius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.model.student;

@Repository
public interface studentrepos extends JpaRepository<student, Long>{


}
