package com.StuMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Worker {


	@Id
	private int WorkerId;
	private String WorkerName;
	private String WorkerField;
	@ManyToOne
	private Location Loc;
	public int getWorkerId() {
		return WorkerId;
	}
	public void setWorkerId(int workerId) {
		this.WorkerId = workerId;
	}
	public String getWorkerName() {
		return WorkerName;
	}
	public void setWorkerName(String WorkerName) {
		this.WorkerName = WorkerName;
	}
	public String getWorkerField() {
		return WorkerField;
	}
	public void setWorkerField(String WorkerField) {
		this.WorkerField = WorkerField;
	}
	public Location getLoc() {
		return Loc;
	}
	public void setLoc(Location Loc) {
		this.Loc = Loc;
	}
	@Override
	public String toString() {
		return "Worker [WorkerId=" + WorkerId + ", WorkerName=" + WorkerName + ", WorkerField=" + WorkerField + ", Loc="
				+ Loc + "]";
	}
	
	
}