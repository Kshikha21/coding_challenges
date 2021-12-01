package com.mindtree.music.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.music.entities.Album;
import com.mindtree.music.entities.Artist;
import com.mindtree.music.entities.Song;
import com.mindtree.music.service.serviceImpl.ServiceImpl;
@RestController
@RequestMapping
public class Controller {

	@Autowired
	 ServiceImpl service;
		//= new ServiceImpl();
	@PostMapping("/addartist")
	private  Artist addArtist( Artist artist) {
	try {
	 
        service.addArtist(artist);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	   return artist;
	   
		
	}
	@PostMapping("/addalbum")
	public Album addAlbums(Album album) {
		try {
			 
	        service.addAlbums(album);

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		   return album;
		   
	

	}
	@PostMapping("/savesong")
	public Song addSongs(Song song) {
		
		try {
			 
	        service.addSongs(song);

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		   return song;
			   
			   
	}
		

}
