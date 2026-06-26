package com.OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
@Id
private int ID;
private String departmentName;

@OneToMany
List<Employe> employes;

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public List<Employe> getEmployes() {
	return employes;
}

public void setEmployes(List<Employe> employes) {
	this.employes = employes;
}

@Override
public String toString() {
	return "Department [ID=" + ID + ", departmentName=" + departmentName + ", employes=" + employes + "]";
}


}
