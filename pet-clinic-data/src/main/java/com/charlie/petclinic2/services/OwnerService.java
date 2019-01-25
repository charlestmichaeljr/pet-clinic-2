package com.charlie.petclinic2.services;

import com.charlie.petclinic2.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    void Save(Owner owner);
    Set<Owner> findAll();
}
