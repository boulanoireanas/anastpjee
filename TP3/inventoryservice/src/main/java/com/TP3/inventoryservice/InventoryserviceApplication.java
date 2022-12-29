package com.TP3.inventoryservice;

import com.TP3.inventoryservice.entities.Product;
import com.TP3.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryserviceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Product.class);
		return args -> {

			productRepository.save(new Product(null,"Computer Desk Top HP",900,20));
			productRepository.save(new Product(null,"Printer Epson",80,50));
			productRepository.save(new Product(null,"MacBook Pro Lap Top",1800,90));
			productRepository.findAll().forEach(p->{
				System.out.println(p.getName());
			});

		};

	}
}
