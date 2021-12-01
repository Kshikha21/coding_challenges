

package com
.mindtree.student.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private String gender;
@ManyToMany
private List<Course> course;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, int age, String gender, List<Course> course) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.course = course;
}
public Student(String name, int age, String gender, List<Course> course) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.course = course;
	
}

public Student(int id, List<Course> course) {
	super();
	this.id = id;
	this.course = course;
}
public Student(String str, List<Course> cou) {
	this.gender=str;
	this.course=cou;
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", course=" + course + "]";
}
public void enrollCourse(Course course2) {
	course.add(course2);
	// TODO Auto-generated method stub
	
}



}
