package com.mindtree.music.service;

import org.springframework.stereotype.Service;

import com.mindtree.music.entities.Album;
import com.mindtree.music.entities.Artist;
import com.mindtree.music.entities.Song;
@Service
public interface MusicService {

	public void addAlbums(Album album);

  public 	void addSongs(Song song);

	public void addArtist(Artist artist);
	

}
