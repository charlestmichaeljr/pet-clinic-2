package com.charlie.petclinic2.services;

import com.charlie.petclinic2.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    void Save(Vet vet);
    Set<Vet> findAll();
}
