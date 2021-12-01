package com.mindtree.musicManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue
	private int id;
	private String songName;
	private String writtenBy;
	private String duration;
	private String lang;
	private String dateOfRelease;
	private String composer;
	

	public Song() {

	}

	public Song(int id, String songName, String writtenBy, String duration, String lang, String dateOfRelease,
			String composer) {
		super();
		this.id = id;
		this.songName = songName;
		this.writtenBy = writtenBy;
		this.duration = duration;
		this.lang = lang;
		this.dateOfRelease = dateOfRelease;
		this.composer =composer;
		//this.artist =artist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getWrittenBy() {
		return writtenBy;
	}

	public void setWrittenBy(String writtenBy) {
		this.writtenBy = writtenBy;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(String dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	
	

	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", writtenBy=" + writtenBy + ", duration=" + duration
				+ ", lang=" + lang + ", dateOfRelease=" + dateOfRelease + ", composer=" + composer + ", artist="
				+  "]";
	}

}
