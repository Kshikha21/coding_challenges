package com.mindtree.music.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String writter;
	private String composer;
	private String language;
	private String duration;
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song(String name, String writter, String composer, String language, String duration) {
		super();
		this.name = name;
		this.writter = writter;
		this.composer = composer;
		this.language = language;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [name=" + name + ", writter=" + writter + ", composer=" + composer + ", language=" + language
				+ ", duration=" + duration + "]";
	}
	

}
