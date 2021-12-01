package com.mindtree.student.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.student.entity.Course;
import com.mindtree.student.entity.Student;
import com.mindtree.student.exception.StudentIdDoesntExistException;
import com.mindtree.student.service.StudentService;

@RestController
@RequestMapping("/relation")
public class Controller {

	@Autowired
	 private StudentService service;
	
	 @PostMapping("/addcourse")
	 
	 public Course saveCourse(@RequestBody Course course) { 
		
		  course = service.addCourse(course);
		 return course;
	 
	 }
	 
	@PostMapping("/addstudent")
	public Student saveStudent(@RequestBody Student student) {
		student=service.addStudent(student);
		 return student;
	}
	@GetMapping("/getcourse")
	public List<Course> getCourse() {
		List<Course> cou=null;
		cou=service.getCourse();
		return cou;
	}

	@PutMapping("/{studentId}/course/{courseId}")      //mapping student id with the courseid 
	public Student assignToCourse(@PathVariable int studentId,
			@PathVariable int courseId ) {
		Student student =service.getOne(studentId);
		Course course=service.getOneCourse(courseId); 
		//subject.setCourse(getCourse());
	  student.enrollCourse(course); 
	  return service.addStudent(student);
}
	@PutMapping("/{studentId}/{courseName}")        //mapping student id with the course  coursename
	public Student assignToCourseName(@PathVariable int studentId, @PathVariable String courseName) {
		Student student=service.getOne(studentId);
		Course course=service.getOneCourseName(courseName);
		student.enrollCourse(course);
		return service.addStudent(student);
	} 
	@GetMapping("/{courseInstructor}")   // get course by courseInstructor
	public List<Course> getInstructor(@PathVariable String courseInstructor) {
		List<Course> cou=null;
		cou=service.getCourseList(courseInstructor);
		return cou;
		
	}
	@GetMapping("/course")   //get course by rating having rating =>4
	public List<Course> getCourseByRating(
			//@PathVariable int rating
			){
		List<Course> cou=null;
	//	cou=service.getCoursesByRating(rating);
		cou=service.getCoursesByRatings();
		return cou;	
	}
	@PutMapping("rating/{studentId}/{rating}")    //adding rate by student
	public Student assigntoRating(@PathVariable int studentId,@PathVariable int rating) {
		Student student =service.getOne(studentId);
		Course course=service.getAllRating(rating); 
		//subject.setCourse(getCourse());
	  student.enrollCourse(course); 
	  return service.addStudent(student);
}
	
	@GetMapping("/gender")                   
	public List<Student> getFemale()
	{
		return service.getFemales();	
		
	}   
	@GetMapping("/mostcourse")
	public void getAllStudentsInCourse(){
		
	System.out.println(service.getStudentsEnrolled());
	
	}
	
	@RequestMapping(value="/getDuration/{studentId}",method=RequestMethod.POST)
	public Student getDurationByStudentId(@RequestBody List<Course> course,@PathVariable int studentId) {
		try {
			return service.mappingIdwithName(course, studentId);
			
		}catch(StudentIdDoesntExistException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	}
	
	
	
