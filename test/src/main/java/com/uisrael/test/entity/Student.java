package com.uisrael.test.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String studentId;
	private String studentName;
	@Temporal(TemporalType.DATE)
	private Date studentDOB;
	private String studentPhone;
	private int studentStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkParent")
	private Parent fkParent;
	
	@OneToMany(mappedBy = "fkStudent")
	private List<Route> listRoute = new ArrayList<>();

}
