package ru.sectorsj.interview_preparation.hw1.first_task.builder.option2;

public class PersonBuilder {
	String firstName;
	String lastName;
	String middleName;
	String country;
	String address;
	String phone;
	int age;
	String gender;
	
	public PersonBuilder addFirstName (String firstName) {
		this.firstName = firstName;
		return this;
	}
	public PersonBuilder addLastName (String lastName) {
		this.lastName = lastName;
		return this;
	}
	public PersonBuilder addMiddleName (String middleName) {
		this.middleName = middleName;
		return this;
	}
	public PersonBuilder addCountry (String country) {
		this.country = country;
		return this;
	}
	public PersonBuilder addAddress (String address) {
		this.address = address;
		return this;
	}
	public PersonBuilder addPhone (String phone) {
		this.phone = phone;
		return this;
	}
	public PersonBuilder addAge (int age) {
		this.age = age;
		return this;
	}
	public PersonBuilder addGender (String gender) {
		this.gender = gender;
		return this;
	}
	
	public Person build() {
		return new Person(this);
	}
}
