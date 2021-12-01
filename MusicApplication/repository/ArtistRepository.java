package com.mindtree.musicManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.musicManagement.entity.Artist;
@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer>{

//	@Query("select ar from Artist ar where ar.awardName=National Award AND ar.gender=female")
//	Artist findByNationalAwardAndIsFemale();
}
