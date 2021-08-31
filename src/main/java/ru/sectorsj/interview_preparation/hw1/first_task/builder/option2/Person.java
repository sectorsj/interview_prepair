package ru.sectorsj.interview_preparation.hw1.first_task.builder.option2;

public class Person {
	private String firstName;
	private String lastName;
	private String middleName;
	private String country;
	private String address;
	private String phone;
	private int age;
	private String gender;
	
	public Person(PersonBuilder personBuilder) {
		this.firstName = personBuilder.firstName;
		this.lastName = personBuilder.lastName;
		this.middleName = personBuilder.middleName;
		this.country = personBuilder.country;
		this.address = personBuilder.address;
		this.phone = personBuilder.phone;
		this.age = personBuilder.age;
		this.gender = personBuilder.gender;
	}
	
	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", middleName='" + middleName + '\'' +
				", country='" + country + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				'}';
	}
}
