package ru.sectorsj.interview_preparation.hw1.first_task.builder;

public class Director {
	DevelopmentDepartment developer;
	
	public void setDeveloper(DevelopmentDepartment developer) {
		this.developer = developer;
	}
	
	Website buildWebsite() {
		developer.createWebsite();
		developer.buildName();
		developer.buildCms();
		developer.buildPrice();
		
		Website website = developer.getWebsite();
		
		return website;
	}
}
