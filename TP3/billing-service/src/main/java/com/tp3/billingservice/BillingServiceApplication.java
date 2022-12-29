package com.tp3.billingservice;

import com.tp3.billingservice.entities.Bill;
import com.tp3.billingservice.entities.ProductItem;
import com.tp3.billingservice.feign.CustomerServiceClient;
import com.tp3.billingservice.feign.InventoryServiceClient;
import com.tp3.billingservice.model.Customer;
import com.tp3.billingservice.model.Product;
import com.tp3.billingservice.repositories.BillRepository;
import com.tp3.billingservice.repositories.ProductItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients @Slf4j
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository,
							CustomerServiceClient customerServiceClient, InventoryServiceClient inventoryServiceClient){
		return args -> {

			Customer customer=customerServiceClient.findCustomerById(1L);

			Bill bill=billRepository.save(new Bill(null,new Date(),null,customer.getId(),null));
			PagedModel<Product> productPagedModel=inventoryServiceClient.findAll();
			productPagedModel.forEach(product -> {
				ProductItem productItem=new ProductItem();
				productItem.setPrice(product.getPrice());
				productItem.setQuantity(1+new Random().nextInt(100));
				productItem.setProductID(product.getId());
				productItem.setBill(bill);
				productItemRepository.save(productItem);
			});
		};
	};

}
