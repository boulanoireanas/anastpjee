package com.TP3.customerservice;

import com.TP3.customerservice.entities.Customer;
import com.TP3.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner start (CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Customer.class);
		return args -> {
			customerRepository.save(new Customer(null,"Anas","contact@anas.ma"));
			customerRepository.save(new Customer(null,"Soufiane","contact@soufiane.ma"));
			customerRepository.save(new Customer(null,"Someting","contact@someting.ma"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
