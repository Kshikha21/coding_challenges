package com.mindtree.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.student.entity.Duration;


public interface DurationRepository extends JpaRepository<Duration,Integer> {

}
