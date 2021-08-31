package ru.sectorsj.interview_preparation.hw1.first_task.builder.option1;

public class Director {
	PersonBuilder builder;
	
	public void setBuilder(PersonBuilder builder) {
		this.builder = builder;
	}
	
	Person buildPerson() {
		builder.createPerson();
		builder.buildFirstName();
		builder.buildLastName();
		builder.buildMiddleName();
		builder.buildCountry();
		builder.buildAddress();
		builder.buildPhone();
		builder.buildAge();
		builder.buildGender();
		
		Person person = builder.getPerson();
		return person;
	}
}
