package com.mindtree.musicManagement.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Album {
	@Id
	@GeneratedValue
	private int albumId;
	private String albumName;
	private String director;
	private String producer;
	private String coregrapher;
	private Date dateOfRelease;
	@OneToMany
	private List<Song> song;

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Album(int albumId, String albumName, String director, String producer, String coregrapher,
			Date dateOfRelease, List<Song> song) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.director = director;
		this.producer = producer;
		this.coregrapher = coregrapher;
		this.dateOfRelease = dateOfRelease;
		this.song = song;
	}



	public List<Song> getSong() {
		return song;
	}



	public void setSong(List<Song> song) {
		this.song = song;
	}



	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getCoregrapher() {
		return coregrapher;
	}

	public void setCoregrapher(String coregrapher) {
		this.coregrapher = coregrapher;
	}

	public Date getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(Date dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", albumName=" + albumName + ", director=" + director + ", producer="
				+ producer + ", coregrapher=" + coregrapher + ", dateOfRelease=" + dateOfRelease + "]";
	}

}
