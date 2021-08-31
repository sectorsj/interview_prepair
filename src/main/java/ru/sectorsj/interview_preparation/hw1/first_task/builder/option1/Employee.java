package ru.sectorsj.interview_preparation.hw1.first_task.builder.option1;

public class Employee extends PersonBuilder {
	@Override
	void buildFirstName() {
		person.setFirstName("Людвиг");
	}
	
	@Override
	void buildLastName() {
		person.setLastName("Бетховен");
	}
	
	@Override
	void buildMiddleName() {
		person.setMiddleName("Ван");
	}
	
	@Override
	void buildCountry() {
		person.setCountry("Австрия");
	}
	
	@Override
	void buildAddress() {
		person.setAddress("г.Мюнхен,ул.Красных Партизан,1-3");
	}
	
	@Override
	void buildPhone() {
		person.setPhone("8910-111-22-33");
	}
	
	@Override
	void buildAge() {
		person.setAge(100);
	}
	
	@Override
	void buildGender() {
		person.setGender("мужчина");
	}
}
