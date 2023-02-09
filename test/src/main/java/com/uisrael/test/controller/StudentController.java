package com.uisrael.test.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.test.entity.Parent;
import com.uisrael.test.entity.Student;
import com.uisrael.test.service.IParentService;
import com.uisrael.test.service.IStudentService;

@Controller
public class StudentController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IStudentService studentService;

	@Autowired
	private IParentService parentService;
	
	@GetMapping("/liststudent")
	public String listStudent(Model model) {
		List<Student> listStudent = studentService.findStudentById(int);
		model.addAttribute("students", listStudent);
		return "/student/liststudent";
		
	}
	
	@GetMapping("/addstudent")
	public String addStudent(Model model ) {
		Student newStudent = new Student ();
		List<Parent> listParent = parentService.findParentByID(int);
		model.addAttribute("student", newStudent);
		model.addAttribute("parent", listParent);
		return "/student/addStudent";
	}
	@PostMapping("/savestudent")
	public String saveStudent(@ModelAttribute("student") Student newstudent) {
		studentService.insertStudent(newstudent);
		return "redirect:/liststudent";
	}
	@GetMapping("/deletestudent/{studentId}")
	public String deleteStudent(@PathVariable Integer studentId) {
		studentService.deleteStudentById(studentId);
		return "redirect:/liststudent";
	}
	@GetMapping("/editstudent/{studentId}")
	public String editStudent(@PathVariable Integer studentId, Model model) {
		List<Parent> listParent = parentService.findParentByID(int id);
		model.addAttribute("student", studentService.findStudentById(id));
		model.addAttribute("parent", listParent);
		return "/student/addstudent";
	}

}
