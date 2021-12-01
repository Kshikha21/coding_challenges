package com.mindtree.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.app.entity.QuarantineCenter;

@Repository
public interface QuarantineCenterRepository  extends JpaRepository<QuarantineCenter,Integer> {

}
