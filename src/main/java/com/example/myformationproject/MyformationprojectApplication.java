package com.example.myformationproject;

import com.example.myformationproject.model.*;
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

		System.out.println(house);
		System.out.println(house1);
		System.out.println("=============================================");

		FoodPantry foodPantry1 = (FoodPantry) apcxt.getBean("foodpantryBean1");
		FoodPantry foodPantry2 = (FoodPantry) apcxt.getBean("foodpantryBean2");

		System.out.println(foodPantry1);
		System.out.println(foodPantry2);
		System.out.println("=============================================");

		Company company = (Company) apcxt.getBean("companyBean");
		Developper developper1 = (Developper) apcxt.getBean("devBean");
		Developper developper2 = (Developper) apcxt.getBean("devBean2");

		System.out.println(company);
		System.out.println(developper1);
		System.out.println(developper2);
		System.out.println("=============================================");

		Service msg1 = new Service();
		msg1.setMessage("Je change le message");
		System.out.println("=============================================");

		Service msg2 = (Service) apcxt.getBean("serviceBean");
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("=============================================");

		Address adrs1= (Address) apcxt.getBean("firstAddress");
		System.out.println(adrs1);
		System.out.println("=============================================");

		Customer customer1 = (Customer) apcxt.getBean("customerBean");
		System.out.println(customer1);
		System.out.println("=============================================");

		KungFu kungFu = (KungFu) apcxt.getBean("firstKungFu");
		System.out.println(kungFu);
		System.out.println("=============================================");

		Panda panda = (Panda) apcxt.getBean("firstPanda");
		System.out.println(panda);
		System.out.println("=============================================");



	}

}
