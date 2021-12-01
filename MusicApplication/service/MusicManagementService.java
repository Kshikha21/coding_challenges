package com.mindtree.musicManagement.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.musicManagement.entity.Album;
import com.mindtree.musicManagement.entity.Artist;
import com.mindtree.musicManagement.entity.Song;
import com.mindtree.musicManagement.exception.serviceException.MusicManagementServiceException;
@Service
public interface MusicManagementService {
	
	void addArtist(Artist artist)throws MusicManagementServiceException;

	Set<Album> getByDirector(String director) throws MusicManagementServiceException;

	Set<Song> getByWriter(String writer) throws MusicManagementServiceException;

	Artist getByAwardNameAndGender() throws MusicManagementServiceException;

	void addSong(Song song) throws MusicManagementServiceException;

	void addAlbum(Album album) throws MusicManagementServiceException;

}
