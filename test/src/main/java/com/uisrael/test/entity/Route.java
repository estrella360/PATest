package com.uisrael.test.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Route implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String routeId;
	private String routeName;
	private String routePhone;
	private int routeStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fkStudent")
	private Student fkStudent;
	

}
