package com.example.myformationproject;

import com.example.myformationproject.model.Company;
import com.example.myformationproject.model.Developper;
import com.example.myformationproject.model.FoodPantry;
import com.example.myformationproject.model.House;
import com.example.myformationproject.service.Service;
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

		System.out.println(house.toString());
		System.out.println(house1.toString());

		FoodPantry foodPantry1 = (FoodPantry) apcxt.getBean("foodpantryBean1");
		FoodPantry foodPantry2 = (FoodPantry) apcxt.getBean("foodpantryBean2");

		System.out.println(foodPantry1.toString());
		System.out.println(foodPantry2.toString());


		Company company = (Company) apcxt.getBean("companyBean");
		Developper developper1 = (Developper) apcxt.getBean("devBean");
		Developper developper2 = (Developper) apcxt.getBean("devBean2");

		System.out.println(company.toString());
		System.out.println(developper1.toString());
		System.out.println(developper2.toString());

		Service msg1 = new Service();
		msg1.setMessage("Je change le message");

		Service msg2 = (Service) apcxt.getBean("serviceBean");
		System.out.println(msg1.toString());
		System.out.println(msg2.toString());
	}

}
