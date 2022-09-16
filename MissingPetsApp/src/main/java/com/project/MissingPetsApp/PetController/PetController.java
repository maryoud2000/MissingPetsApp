package com.project.MissingPetsApp.PetController;

import com.project.MissingPetsApp.Pet.Pet;
import com.project.MissingPetsApp.PetService.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    PetService petService;

    // creating a GET mapping that retrives all the Pet detail from the database
    @GetMapping("/pet")
    private List<Pet> getAllPet(){
        return petService.getAllPets();
    }

    // creating a GET mapping that retrives the detail of a specific Pet
    @GetMapping("/pet/{id}")
    private Pet getPet(@PathVariable("id") int id){
        return petService.getPetByID(id);
    }

    // creating a DELETE mapping that Delete the detail of a specific Pet
    @DeleteMapping("/pet/{id}")
    private void deletePet(@PathVariable("id") int id){
        petService.delete(id);
    }

    // creating a POST mapping that Post the Pet detail to the database
    @PostMapping("/pet") // localhost:8089/pet //  endpoint
    private int savePet(@RequestBody Pet pet){
        petService.saveOrUpdate(pet);
        return pet.getId();
    }

}