package ru.sectorsj.interview_preparation.hw1.builder;

import java.math.BigDecimal;

public class EnterpriseDevelopmentDepartment extends DevelopmentDepartment {
	@Override
	void buildName() {
		website.setName("Enterprise web site");
	}
	
	@Override
	void buildCms() {
		website.setCms(Cms.OPENCART);
	}
	
	@Override
	void buildPrice() {
		website.setPrice(BigDecimal.valueOf(50000.9));
	}
}
