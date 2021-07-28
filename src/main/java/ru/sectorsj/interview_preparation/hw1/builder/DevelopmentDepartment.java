package ru.sectorsj.interview_preparation.hw1.builder;

public abstract class DevelopmentDepartment {
	Website website;
	
	void createWebsite() {
		website = new Website();
	}
	
	abstract void buildName();
	abstract void buildCms();
	abstract void buildPrice();
	
	Website getWebsite() {
		return website;
	}
}
