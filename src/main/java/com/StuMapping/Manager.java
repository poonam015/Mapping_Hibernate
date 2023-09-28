package com.StuMapping;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Manager {

	@Id
	private int ManagerId;
	private String ManagerName;
	private String ManagerLocation;
	
	@ManyToMany(targetEntity=Laptop.class, fetch=FetchType.EAGER)
	@JoinTable(
			name="Manager_Laptop",
			joinColumns= {@JoinColumn(name="ManagerId")},
			inverseJoinColumns= {@JoinColumn(name="LaptopId")}
			)
	private List<Laptop> lap;

	public int getManagerId() {
		return ManagerId;
	}

	public void setManagerId(int managerId) {
		this.ManagerId = managerId;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		this.ManagerName = managerName;
	}

	public String getManagerLocation() {
		return ManagerLocation;
	}

	public void setManagerLocation(String managerLocation) {
		this.ManagerLocation = managerLocation;
	}

	public List<Laptop> getLap() {
		return lap;
	}

	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + ManagerId + ", managerName=" + ManagerName + ", managerLocation="
				+ ManagerLocation + ", lap=" + lap + "]";
	}
	
}
