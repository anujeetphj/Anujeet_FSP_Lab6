package com.greatlearning.studentmgmtsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentmgmtsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
