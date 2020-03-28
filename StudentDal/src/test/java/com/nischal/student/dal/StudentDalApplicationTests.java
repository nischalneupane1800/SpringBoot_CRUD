package com.nischal.student.dal;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nischal.student.dal.entities.Student;
import com.nischal.student.dal.repos.StudentRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
class StudentDalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setSname("Nischal");
		student.setScourse("Computer Science");
		student.setSfee(30d);
		studentRepository.save(student);
	}
	
	@Test
	public void findStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
		
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
}
