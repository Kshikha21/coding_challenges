package com.mindtree.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.music.entities.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Integer> {
	

}
