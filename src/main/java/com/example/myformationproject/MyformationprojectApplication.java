package com.example.myformationproject;

import com.example.myformationproject.model.Company;
import com.example.myformationproject.model.Developper;
import com.example.myformationproject.model.FoodPantry;
import com.example.myformationproject.model.House;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MyformationprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyformationprojectApplication.class, args);
		ClassPathXmlApplicationContext apcxt = new ClassPathXmlApplicationContext("spring-beans.xml");


		House house = (House) apcxt.getBean(("houseBean1"));
		House house1 = (House) apcxt.getBean(("houseBean2"));

		System.out.println(house);
		System.out.println(house1);

		FoodPantry foodPantry1 = (FoodPantry) apcxt.getBean("foodpantryBean1");
		FoodPantry foodPantry2 = (FoodPantry) apcxt.getBean("foodpantryBean2");

		System.out.println(foodPantry1);
		System.out.println(foodPantry2);


		Company company = (Company) apcxt.getBean("companyBean");
		Developper developper1 = (Developper) apcxt.getBean("devBean");
		Developper developper2 = (Developper) apcxt.getBean("devBean2");

		System.out.println(company);
		System.out.println(developper1);
		System.out.println(developper2);
	}

}
