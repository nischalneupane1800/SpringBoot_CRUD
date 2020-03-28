package com.nischal.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.nischal.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
