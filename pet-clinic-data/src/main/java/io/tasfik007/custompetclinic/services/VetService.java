package io.tasfik007.custompetclinic.services;

import io.tasfik007.custompetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet owner);
}
