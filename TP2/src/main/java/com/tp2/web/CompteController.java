package com.tp2.web;

import com.tp2.dto.CompteRequestDTO;
import com.tp2.dto.CompteResponseDTO;
import com.tp2.entities.Compte;
import com.tp2.mappers.CompteMapper;
import com.tp2.repositories.CompteRepository;
import com.tp2.services.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CompteController {

    private CompteRepository compteRepository;
    private CompteService compteService;
    private CompteMapper compteMapper;

    public CompteController(CompteRepository compteRepository, CompteService compteService, CompteMapper compteMapper){
        this.compteRepository=compteRepository;
        this.compteService = compteService;
        this.compteMapper = compteMapper;
    }
    @GetMapping("/comptes")
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

    @GetMapping("/compte/{id}")
    public Compte compte(@PathVariable String id){
        return compteRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }

    @PostMapping("/compte/add")
    public CompteResponseDTO create(@RequestBody CompteRequestDTO compteRequestDTO){
        return compteService.add(compteRequestDTO);
    }
    @PutMapping("/compte/update/{id}")
    public Compte update(@PathVariable String id,@RequestBody Compte compte){
        Compte compteToUpdate=compteRepository.findById(id).orElseThrow();

        if(compte.getBalance() !=null) compteToUpdate.setBalance(compte.getBalance());
        if(compte.getCreatedAt() !=null) compteToUpdate.setCreatedAt(compte.getCreatedAt());
        if(compte.getType() !=null) compteToUpdate.setType(compte.getType());
        if(compte.getCurrency() !=null) compteToUpdate.setCurrency(compte.getCurrency());

        return compteRepository.save(compteToUpdate);
    }
    @DeleteMapping("/compte/delete/{id}")
    public void delete(@PathVariable String id){
        compteRepository.deleteById(id);
    }
}
