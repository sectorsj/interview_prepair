package ru.sectorsj.interview_preparation.hw1.first_task.builder;

public class WebsiteBuildTask {
	public static void main(String[] args) {
		Director director = new Director();
		
		director.setDeveloper(new VisitCardDevelopmentDepartment());
		Website website = director.buildWebsite();
		
		System.out.println(website);
	}
}
