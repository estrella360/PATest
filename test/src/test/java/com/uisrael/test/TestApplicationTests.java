package com.uisrael.test;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.test.entity.Student;
import com.uisrael.test.service.IParentService;
import com.uisrael.test.service.IRouteService;
import com.uisrael.test.service.IStudentService;

@SpringBootTest
class TestApplicationTests {
	
	@Autowired
	private IStudentService serviceStudent;
	
	/*
	@Autowired
	private IParentService serviceParent;
	@Autowired
	private IRouteService serviceRoute;
*/
	@Test
	void contextLoads() {
	//void contextLoads() throws ParseException {
		
		Student nuevo = new Student();
		nuevo.setStudentName("Jorge");
		nuevo.setStudentPhone("123");
		serviceStudent.insertStudent(nuevo);
		
	}

}
