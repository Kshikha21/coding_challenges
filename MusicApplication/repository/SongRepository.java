package com.mindtree.musicManagement.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.musicManagement.entity.Song;
@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
	@Query("select s from Song s where s.writtenBy=?1")
	Set<Song> findByWriter(String Writer);
}
