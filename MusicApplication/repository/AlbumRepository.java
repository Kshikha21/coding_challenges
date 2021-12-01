package com.mindtree.musicManagement.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.musicManagement.entity.Album;
@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
	@Query("select a from Album a where a.director=?1")
	Set<Album> findByDirector(String directorName);
}
