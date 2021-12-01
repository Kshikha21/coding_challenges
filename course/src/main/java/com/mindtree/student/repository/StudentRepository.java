package com.mindtree.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.student.entity.Course;
import com.mindtree.student.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	@Query("select c from Student c where c.gender=?1 ")
	List<Student> findbyNameFemale(String gender);
	
	
	
	

}
