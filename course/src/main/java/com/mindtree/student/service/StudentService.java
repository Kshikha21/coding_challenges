package com.mindtree.student.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mindtree.student.entity.Course;
import com.mindtree.student.entity.Student;
import com.mindtree.student.exception.StudentIdDoesntExistException;

@Service
public interface StudentService {

	 public Course addCourse(Course course);

	public Student addStudent(Student student);

	public List<Course> getCourse();

	public List<Course> getCourseList(String courseInstructor);

	public Student getOne(int studentId);

	public Course getOneCourse(int courseId);

	public Course getOneCourseName(String courseName);

	//public List<Course> getCoursesByRating(int rating);

	public List<Course> getCoursesByRatings();

	public Course getAllRating(int rating);

	
	public List<Student> getFemales();
	public List<String> getStudentsEnrolled();
	
	
	public Student mappingIdwithName(List<Course> courseName, int studentId) throws StudentIdDoesntExistException;

	
	

	
	

}
