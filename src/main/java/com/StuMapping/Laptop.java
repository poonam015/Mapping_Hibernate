package com.StuMapping;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {

	@Id
	private int LaptopId;
	private String LaptopName;
	@ManyToMany
	private List<Manager> Man;
	public int getLaptopId() {
		return LaptopId;
	}
	public void setLaptopId(int laptopId) {
		this.LaptopId = laptopId;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		this.LaptopName = laptopName;
	}
	public List<Manager> getMan() {
		return Man;
	}
	public void setMan(List<Manager> Man) {
		this.Man = Man;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + LaptopId + ", laptopName=" + LaptopName + ", Man=" + Man + "]";
	}
	
}
