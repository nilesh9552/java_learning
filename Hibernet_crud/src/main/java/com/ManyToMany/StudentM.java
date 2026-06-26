package com.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class StudentM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	
	@ManyToMany
	List<Cources>List;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Cources> getList() {
		return List;
	}

	public void setList(List<Cources> list) {
		List = list;
	}

	@Override
	public String toString() {
		return "StudentM [Id=" + Id + ", Name=" + Name + ", List=" + List + "]";
	}
	
	
	
}
