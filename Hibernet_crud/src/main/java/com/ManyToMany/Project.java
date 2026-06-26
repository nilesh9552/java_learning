package com.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_ID;
	private String p_Name;
	
	@ManyToMany
	List<Employe> emp;

	public int getP_ID() {
		return p_ID;
	}

	public void setP_ID(int p_ID) {
		this.p_ID = p_ID;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public List<Employe> getEmp() {
		return emp;
	}

	public void setEmp(List<Employe> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [p_ID=" + p_ID + ", p_Name=" + p_Name + ", emp=" + emp + "]";
	}
	
	
}
