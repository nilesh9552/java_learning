package com.ManyToMany;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employe {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmpId;
	private String Name;
	
	@ManyToMany
	List<Project> projects;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employe [EmpId=" + EmpId + ", Name=" + Name + ", projects=" + projects + "]";
	}
	
	
	
}
