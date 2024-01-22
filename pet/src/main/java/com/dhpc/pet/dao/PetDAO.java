package com.dhpc.pet.dao;

import com.dhpc.pet.repository.PetRepository;
import com.dhpc.pet.service.PetStore;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class PetDAO implements PetStore {
    private final PetRepository petRepository;


    public PetDAO(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
}
