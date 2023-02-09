package com.uisrael.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.test.entity.Student;
import com.uisrael.test.repository.IStudentRepository;
import com.uisrael.test.service.IStudentService;

@Service
@Component
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepository repository;

	@Override
	public void insertStudent(Student newStudent) {
		try {
			repository.save(newStudent);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Student> findStudentById(int idStudent) {
		// TODO Auto-generated method stub
		return repository.findStudentById(idStudent);
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteStudentById(int studentId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteStudentById(studentId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
