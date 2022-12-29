package com.tp2.services;

import com.tp2.dto.CompteRequestDTO;
import com.tp2.dto.CompteResponseDTO;
import com.tp2.entities.Compte;
import com.tp2.enums.AccountType;
import com.tp2.mappers.CompteMapper;
import com.tp2.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;


@Service @Transactional
public class CompteServiceImpl implements CompteService {
    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private CompteMapper compteMapper;

    @Override
    public CompteResponseDTO add(CompteRequestDTO compteDTO) {
        Compte savedCompte=compteRepository.save(compteMapper.fromCompteRequestDTO(compteDTO));
        return compteMapper.fromCompte(savedCompte);
    }
}
