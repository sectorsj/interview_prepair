package ru.sectorsj.interview_preparation.hw1.first_task.builder.option2;

public class Main {
	public static void main(String[] args) {
		Person person = new PersonBuilder()
				.addFirstName("Алекс")
				.addLastName("Фон")
				.addMiddleName("Бах")
				.addCountry("Россия")
				.addAddress("г.Москва,ул.Красная, 1-1")
				.addPhone("8999-000-00-00")
				.addAge(31)
				.addGender("мужчина")
				.build();
		System.out.println(person);
	}
}
