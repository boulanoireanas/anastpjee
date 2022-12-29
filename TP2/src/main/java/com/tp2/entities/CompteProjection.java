package com.tp2.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Compte.class, name = "projection1")
public interface CompteProjection {
    public String getId();
    public Compte getType();
    public Double getBalance();
}
