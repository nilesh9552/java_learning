package com.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity

public class Cources {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CourceId;
	private String CourceName;
	
	@ManyToMany(mappedBy = "List")
    private List<StudentM> studentM;

	public int getCourceId() {
		return CourceId;
	}

	public void setCourceId(int courceId) {
		CourceId = courceId;
	}

	public String getCourceName() {
		return CourceName;
	}

	public void setCourceName(String courceName) {
		CourceName = courceName;
	}

	public List<StudentM> getStudentM() {
		return studentM;
	}

	public void setStudentM(List<StudentM> studentM) {
		this.studentM = studentM;
	}

	@Override
	public String toString() {
		return "Cources [CourceId=" + CourceId + ", CourceName=" + CourceName + ", studentM=" + studentM + "]";
	}
	
	
}
