package com.mindtree.musicManagement.controller;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.musicManagement.entity.Album;
import com.mindtree.musicManagement.entity.Artist;
import com.mindtree.musicManagement.entity.Song;
import com.mindtree.musicManagement.exception.serviceException.MusicManagementServiceException;
import com.mindtree.musicManagement.service.serviceImpl.MusicManagementServiceImpl;
@RestController
@RequestMapping("/music")
public class MusicManagement {

	
	@Autowired
	private MusicManagementServiceImpl service;
	
	@PostMapping("/addArtist")
	private Artist saveArtist(Artist artist) {
		
		try {
			service.addArtist(artist);
		} catch (MusicManagementServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return artist;
	}
	
	@PostMapping("/addAlbum")
	private Album saveAlbum(Album album) {
		
		try {
			service.addAlbum(album);
		} catch (MusicManagementServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return album;
	}
	
	@PostMapping("/addSong")
	private Song saveSong(Song song) {
		
		try {
			service.addSong(song);
		} catch (MusicManagementServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return song;
	}
	
	@GetMapping("/getbyDirector/{dId}")
	private Set<Album> getAlbumByDirector(@PathVariable("dId") String director) {
		Set<Album> list=new TreeSet<Album>();
		try {
			list = service.getByDirector(director);
			//return list;
		} catch (MusicManagementServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		}
	
	@GetMapping("/getbyWriter/{wId}")
	private Set<Song> getSongByWriter(@PathVariable("wId") String writer) {
		Set<Song> list=new TreeSet<Song>();
		try {
			list = service.getByWriter(writer);
			//return list;
		} catch (MusicManagementServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		}
	
	
//	@GetMapping("/getartist")
//	private Artist getArtistby() {
//		Artist list=null;
//		try {
//			list = service.getByAwardNameAndGender();
//			//return list;
//		} catch (MusicManagementServiceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//		}
//	
}
