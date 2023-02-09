package com.uisrael.test.service;

import java.util.List;

import com.uisrael.test.entity.Student;

public interface IStudentService {
	//•	Listar los datos de estudiantes por ruta y mostrar datos del representante
	
	public void insertStudent(Student newStudent);
	
	public List<Student> listStudent();
	
	public List<Student> findStudentById(int idStudent);
	
	public void deleteStudentById(int studentId);
	
	

}
