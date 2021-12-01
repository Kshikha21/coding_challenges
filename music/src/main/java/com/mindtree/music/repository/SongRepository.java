package com.mindtree.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.music.entities.Song;
@Repository
public interface SongRepository extends JpaRepository<Song,Integer> {

}
