package com.mindtree.music.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.music.entities.Album;
import com.mindtree.music.entities.Artist;
import com.mindtree.music.entities.Song;
import com.mindtree.music.repository.AlbumRepository;
import com.mindtree.music.repository.ArtistRepository;
import com.mindtree.music.repository.SongRepository;
import com.mindtree.music.service.MusicService;

@Service
public class ServiceImpl implements MusicService {
	@Autowired
	AlbumRepository album;
	
	@Autowired
	SongRepository song;
	
	@Autowired
	ArtistRepository artist;

	@Override
	public void addAlbums(Album albums) {
		album.save(albums);
		
	}


	@Override
	public void addSongs(Song songs) {
      song.save(songs);
   
	}


	@Override
	public void addArtist( Artist art) {
		 artist.save(art);
		
		
		
	}

}
