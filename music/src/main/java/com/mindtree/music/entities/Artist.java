package com.mindtree.music.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String awards;
	private String gender;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Album> albums;
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artist(String name, int age, String awards, String gender, List<Album> albums) {
		super();
		this.name = name;
		this.age = age;
		this.awards = awards;
		this.gender = gender;
		this.albums = albums;
	}
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", age=" + age + ", awards=" + awards + ", gender=" + gender
				+ ", albums=" + albums + "]";
	}
	public Artist(int id, List<Album> albums) {
		super();
		this.id = id;
		this.albums = albums;
	}
	public Artist(String name2, int age2, String awards2, String gender2) {
		super();
		this.name = name2;
		this.age = age2;
		this.awards = awards2;
		this.gender = gender2;
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
