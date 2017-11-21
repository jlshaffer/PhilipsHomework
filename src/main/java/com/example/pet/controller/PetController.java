// PetController.java
package com.example.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.pet.model.PetModel;
import com.example.pet.service.ServicePet;

@RestController
public class PetController
{
	@Autowired
    ServicePet petService; 
	
	// From Spec:
	//  create a CRUD set of restful end-points for getting a pet (& medical history),
	//	a list of pets, and create, delete and update functions.
    
    @RequestMapping(value = "/pet/", method = RequestMethod.POST)
    public ResponseEntity<Void> createPet(@RequestBody PetModel pet, UriComponentsBuilder ucBuilder) 
    {
        System.out.println("Creating Pet " + pet.getName());
          
 
        // TODO - JLS - Check for pet first
        
        String petId = petService.savePet(pet);
        
        // Google is your friend. 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/pet/{id}").buildAndExpand(petId).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }    
}