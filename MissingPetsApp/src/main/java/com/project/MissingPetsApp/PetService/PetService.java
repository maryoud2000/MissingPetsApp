package com.project.MissingPetsApp.PetService;

import com.project.MissingPetsApp.Pet.Pet;
import com.project.MissingPetsApp.PetRepo.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;

    public List<Pet> getAllPets(){
        List<Pet> pets = new ArrayList<Pet>();
        petRepository.findAll().forEach(pet -> pets.add(pet));
        return pets;
    }

    // getting a specific record

    public Pet getPetByID(int id){
        return petRepository.findById(id).get();
    }

    public void saveOrUpdate(Pet pet){
        petRepository.save(pet);
    }

    // deleting a specific record //
    public void delete(int id){
        petRepository.deleteById(id);
    }
}