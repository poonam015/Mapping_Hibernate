package com.StuMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	private int BikeId;
	private String BikeName;
	public int getBikeId() {
		return BikeId;
	}
	public void setBikeId(int bikeId) {
		this.BikeId = bikeId;
	}
	public String getBikeName() {
		return BikeName;
	}
	public void setBikeName(String bikeName) {
		this.BikeName = bikeName;
	}
	@Override
	public String toString() {
		return "Bike [BikeId=" + BikeId + ", BikeName=" + BikeName + "]";
	} 
	
	

}
