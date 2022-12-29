package com.tp3.billingservice.controllers;

import com.tp3.billingservice.entities.Bill;
import com.tp3.billingservice.entities.ProductItem;
import com.tp3.billingservice.model.Product;
import com.tp3.billingservice.repositories.BillRepository;
import com.tp3.billingservice.repositories.ProductItemRepository;
import com.tp3.billingservice.feign.CustomerServiceClient;
import com.tp3.billingservice.feign.InventoryServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients @Slf4j
public class BillRestController {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ProductItemRepository productItemRepository;
    @Autowired
    private CustomerServiceClient customerServiceClient;
    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @GetMapping("bills/full/{id}")
    Bill getBill(@PathVariable(name = "id") Long id){
        Bill bill=billRepository.findById(id).get();
        bill.setCustomer(customerServiceClient.findCustomerById(bill.getCustomerID()));
        bill.setProductItems(productItemRepository.findByBillId(bill.getId()));
        return bill;
    }
}
