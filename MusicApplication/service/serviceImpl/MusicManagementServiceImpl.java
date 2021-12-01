package com.mindtree.musicManagement.service.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mindtree.musicManagement.entity.Album;
import com.mindtree.musicManagement.entity.Artist;
import com.mindtree.musicManagement.entity.Song;
import com.mindtree.musicManagement.exception.serviceException.MusicManagementServiceException;
import com.mindtree.musicManagement.exception.serviceException.NotFoundException;
import com.mindtree.musicManagement.repository.AlbumRepository;
import com.mindtree.musicManagement.repository.ArtistRepository;
import com.mindtree.musicManagement.repository.SongRepository;
import com.mindtree.musicManagement.service.MusicManagementService;

@Service
public class MusicManagementServiceImpl implements MusicManagementService {

	@Autowired
	private AlbumRepository albumRepository;

	@Autowired
	private SongRepository songRepository;

	@Autowired
	private ArtistRepository artistRepository;

	@Override
	public void addArtist(Artist artist) throws MusicManagementServiceException {

		artistRepository.save(artist);
	}

	
	@Override
	public void addAlbum(Album album) throws MusicManagementServiceException {

		albumRepository.save(album);
	}
	
	@Override
	public void addSong(Song song) throws MusicManagementServiceException {

		songRepository.save(song);
	}
	@Override
	public Set<Album> getByDirector(String director) throws MusicManagementServiceException {

		try {
			Set<Album> album = albumRepository.findByDirector(director);
			if (album == null) {
				throw new NotFoundException();
			}
			return album;
		} catch (NotFoundException e) {
			throw new MusicManagementServiceException("no director found with this name");
		}

		catch (DataAccessException e) {
			throw new MusicManagementServiceException("try again");
		}
	}

	@Override
	public Set<Song> getByWriter(String writer) throws MusicManagementServiceException {

		try {
			Set<Song> song = songRepository.findByWriter(writer);
			if (song == null) {
				throw new NotFoundException();
			}
			return song;
		} catch (NotFoundException e) {
			throw new MusicManagementServiceException("no writer found with this name");
		}

		catch (DataAccessException e) {
			throw new MusicManagementServiceException("try again");
		}
	}


	@Override
	public Artist getByAwardNameAndGender() throws MusicManagementServiceException {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
//	public Artist getByAwardNameAndGender() throws MusicManagementServiceException {
//
//		try {
//			Artist artist = artistRepository.findByNationalAwardAndIsFemale();
//			if (artist == null) {
//				throw new NotFoundException();
//			}
//			return artist;
//		} catch (NotFoundException e) {
//			throw new MusicManagementServiceException("no writer found with this name");
//		}
//
//		catch (DataAccessException e) {
//			throw new MusicManagementServiceException("try again");
//		}
//	}
}
