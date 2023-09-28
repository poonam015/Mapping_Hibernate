package com.StuMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int StId;
	private String StName;
	private String StClass;
	
	@OneToOne
	private Bike Bike;

	public int getStId() {
		return StId;
	}

	public void setStId(int StId) {
		this.StId = StId;
	}

	public String getStName() {
		return StName;
	}

	public void setStName(String StName) {
		this.StName = StName;
	}

	public String getStClass() {
		return StClass;
	}

	public void setStClass(String StClass) {
		this.StClass = StClass;
	}

	public Bike getBike() {
		return Bike;
	}

	public void setBike(Bike Bike) {
		this.Bike = Bike;
	}

	@Override
	public String toString() {
		return "Student [StId=" + StId + ", StName=" + StName + ", StClass=" + StClass + ", Bike=" + Bike + "]";
	}


	
	

}
