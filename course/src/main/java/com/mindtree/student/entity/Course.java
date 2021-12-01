package com.mindtree.student.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CourseId;
	private String courseName;
	private String courseInstructor;
	private int rating;
	private int duration;
	@JsonIgnore
	@ManyToMany(mappedBy="course")
	private List<Student> student;
	
	
	public Course(String courseName, List<Student> student) {
		super();
		this.courseName = courseName;
		this.student = student;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Course(int courseId, String courseName, String courseInstructor, int rating, int duration,
			List<Student> student) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.rating = rating;
		this.duration = duration;
		this.student = student;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, String courseInstructor, int rating, int duration) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.rating = rating;
		this.duration = duration;
	}
	public Course(String courseName, String courseInstructor, int rating, int duration) {
		super();
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.rating = rating;
		this.duration = duration;
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", courseName=" + courseName + ", courseInstructor=" + courseInstructor
				+ ", rating=" + rating + ", duration=" + duration + "]";
	}
	

}
