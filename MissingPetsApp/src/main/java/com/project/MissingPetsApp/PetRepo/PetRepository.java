package com.project.MissingPetsApp.PetRepo;

import com.project.MissingPetsApp.Pet.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Integer> {



}