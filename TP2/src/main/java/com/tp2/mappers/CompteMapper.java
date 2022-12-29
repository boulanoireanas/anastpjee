package com.tp2.mappers;

import com.tp2.dto.CompteRequestDTO;
import com.tp2.dto.CompteResponseDTO;
import com.tp2.entities.Compte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class CompteMapper {
    public CompteResponseDTO fromCompte(Compte compte){
       CompteResponseDTO compteResponseDTO=new CompteResponseDTO();
        BeanUtils.copyProperties(compte,compteResponseDTO);
        return compteResponseDTO;
    }
    public Compte fromCompteRequestDTO(CompteRequestDTO compteRequestDTO){
        Compte compte=new Compte();
        compte.setId(UUID.randomUUID().toString());
        compte.setCreatedAt(new Date());
        BeanUtils.copyProperties(compteRequestDTO,compte);
        return  compte;
    }
}
