package com.mindtree.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.music.entities.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Integer>{

}
