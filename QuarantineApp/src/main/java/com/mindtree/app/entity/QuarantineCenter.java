package com.mindtree.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuarantineCenter {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int quarantineID;
	private String placeName;
	private String strength;
	public QuarantineCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuarantineCenter(int quarantineID, String placeName, String strength) {
		super();
		this.quarantineID = quarantineID;
		this.placeName = placeName;
		this.strength = strength;
	}
	public int getQuarantineID() {
		return quarantineID;
	}
	public void setQuarantineID(int quarantineID) {
		this.quarantineID = quarantineID;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "QuarantineCenter [quarantineID=" + quarantineID + ", placeName=" + placeName + ", strength=" + strength
				+ "]";
	}
	
	

}
