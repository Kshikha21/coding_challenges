package com.mindtree.musicManagement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	@Id
	@GeneratedValue
	private int artistId;
	private String artistName;
	private String gender;
	private int age;
	private int noOfAwards;
	private String awardName;
	@OneToMany
	private List<Album> album;

	public Artist() {

	}

	public Artist(int artistId, String artistName, String gender, int age, int noOfAwards, String awardName,
			List<Album> album) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.gender = gender;
		this.age = age;
		this.noOfAwards = noOfAwards;
		this.awardName = awardName;
		this.album = album;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfAwards() {
		return noOfAwards;
	}

	public void setNoOfAwards(int noOfAwards) {
		this.noOfAwards = noOfAwards;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", gender=" + gender + ", age=" + age
				+ ", noOfAwards=" + noOfAwards + ", awardName=" + awardName + ", album=" + album + "]";
	}

}
