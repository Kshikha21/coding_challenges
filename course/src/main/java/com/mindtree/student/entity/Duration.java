package com.mindtree.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duration {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int studentId;
	private int totalDuration;
	

	public Duration() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public int getTotalDuration() {
		return totalDuration;
	}



	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}



	public Duration(int studentId, int totalDuration) {
		this.studentId=studentId;
		this.totalDuration=totalDuration;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Duration [id=" + id + ", studentId=" + studentId + ", totalDuration=" + totalDuration + "]";
	}

}
