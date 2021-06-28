package io.tasfik007.custompetclinic.services;

import io.tasfik007.custompetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
