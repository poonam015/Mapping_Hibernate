package com.StuMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Project {

		@Id
		private int ProjectId;
		private String ProjectName;
		public int getProjectId() {
			return ProjectId;
		}
		public void setProjectId(int ProjectId) {
			this.ProjectId = ProjectId;
		}
		public String getProjectName() {
			return ProjectName;
		}
		public void setProjectName(String ProjectName) {
			this.ProjectName = ProjectName;
		}
		@Override
		public String toString() {
			return "Project [ProjectId=" + ProjectId + ", ProjectName=" + ProjectName + "]";
		}
	}
