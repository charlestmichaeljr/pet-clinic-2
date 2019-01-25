package com.charlie.petclinic2.services;


import com.charlie.petclinic2.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    void Save(Pet pet);
    Set<Pet> findAll();
}
