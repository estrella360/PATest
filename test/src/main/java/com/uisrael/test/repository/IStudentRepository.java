package com.uisrael.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.uisrael.test.entity.Student;

@Repository
@Component
public interface IStudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("Select s from Student s where s.studentId=?1")
	public List<Student> findStudentById(int studentId);
	
	@Query("UPDATE Student s SET s.studentStatus = false WHERE s.studentId = ?1")
	public void deleteStudentById(int studentId);

}
