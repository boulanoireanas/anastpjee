package com.tp2.services;

import com.tp2.dto.CompteResponseDTO;
import com.tp2.dto.CompteRequestDTO;

public interface CompteService{
    public CompteResponseDTO add(CompteRequestDTO compteDTO);
}
