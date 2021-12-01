package com.mindtree.student.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.student.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

	@Query("select c from Course c where c.courseName=:courseName")
	Course findbyName(String courseName);

	@Query("select c from Course c where c.courseInstructor=?1")
	List<Course> findByInstructor(String courseInstructor);

	@Query(value="select * from Course  where rating >= '4' Limit 0,3",nativeQuery=true)  //sql native 
	List<Course> findByRating();

	

	@Query(value="select * from Course c  where c.rating= ?1",nativeQuery=true)  //sql native 
	Course findByRating(int rating);
	//List<Course> findByRating(int rating);

  // @Query(value=" select courseName, count(*) from Course group by courseName order by count(courseName) ",nativeQuery=true)
	  

	
  @Query("select  count(c.courseName) from Course c group by c.courseName order by count( c.courseName) desc")
   List<String> findallCourse();

 
	
}
