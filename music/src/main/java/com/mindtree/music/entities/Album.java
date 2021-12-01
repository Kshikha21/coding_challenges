package com.mindtree.music.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String dateOfRelease;
	private String producer;
	private String choreographer;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Song> songs;
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(int id, String name, String dateOfRelease, String producer, String choreographer, List<Song> songs) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfRelease = dateOfRelease;
		this.producer = producer;
		this.choreographer = choreographer;
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", name=" + name + ", dateOfRelease=" + dateOfRelease + ", producer=" + producer
				+ ", choreographer=" + choreographer + ", songs=" + songs + "]";
	}
	public Album(String name, String dateOfRelease, String producer, String choreographer, List<Song> songs) {
		super();
		this.name = name;
		this.dateOfRelease = dateOfRelease;
		this.producer = producer;
		this.choreographer = choreographer;
		this.songs = songs;
	}
	public Album(String name2, String dor, String producer2, String choregrapher) {
	
		this.name = name2;
		this.dateOfRelease = dor;
		this.producer = producer2;
		this.choreographer = choregrapher;
		// TODO Auto-generated constructor stub
	}
	
	

}
