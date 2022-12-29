package com.tp3.billingservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullOrder",types = Bill.class)
public interface billProjection {
    Long getId();
    Date getBillingDate();
    Long getCustomerID();


}
