package ru.sectorsj.interview_preparation.hw1.builder;

import java.math.BigDecimal;

public class VisitCardDevelopmentDepartment extends DevelopmentDepartment {
	@Override
	void buildName() {
		website.setName("Visit card");
	}
	
	@Override
	void buildCms() {
		website.setCms(Cms.WORDPRESS);
	}
	
	@Override
	void buildPrice() {
		website.setPrice(BigDecimal.valueOf(500));
	}
}
