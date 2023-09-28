package com.StuMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	private int LocationId;
	private String LocationName;
	private String LocationState;
	public int getLocationId() {
		return LocationId;
	}
	public void setLocationId(int LocationId) {
		this.LocationId = LocationId;
	}
	public String getLocationName() {
		return LocationName;
	}
	public void setLocationName(String LocationName) {
		this.LocationName = LocationName;
	}
	public String getLocationState() {
		return LocationState;
	}
	public void setLocationState(String LocationState) {
		this.LocationState = LocationState;
	}
	@Override
	public String toString() {
		return "Location [LocationId=" + LocationId + ", LocationName=" + LocationName + ", LocationState="
				+ LocationState + "]";
	}
}
