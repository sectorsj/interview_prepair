package ru.sectorsj.interview_preparation.hw1.first_task.builder.option1;

public class Manager extends PersonBuilder{
	@Override
	void buildFirstName() {
		person.setFirstName("Semen");
	}
	
	@Override
	void buildLastName() {
		person.setLastName("Ivanov");
	}
	
	@Override
	void buildMiddleName() {
		person.setMiddleName("Grigorievich");
	}
	
	@Override
	void buildCountry() {
		person.setCountry("Russia");
	}
	
	@Override
	void buildAddress() {
		person.setAddress("Moscow city, Red street 32 - 2");
	}
	
	@Override
	void buildPhone() {
		person.setPhone("8999-999-99-99");
	}
	
	@Override
	void buildAge() {
		person.setAge(32);
	}
	
	@Override
	void buildGender() {
		person.setGender("male");
	}
}
