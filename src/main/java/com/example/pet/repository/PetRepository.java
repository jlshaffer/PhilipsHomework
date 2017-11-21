// PetRepository.java
package com.example.pet.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.pet.entity.PetEntity;

public interface PetRepository extends MongoRepository<PetEntity, String> 
{
	// HACK - JLS - Learn why the heck I have to suppress this warning.
	@SuppressWarnings("unchecked")
	public PetEntity save(PetEntity saved);
	
	// TODO JLS - The rest after I get something saved to disk
	
	// Find
	
	// Update
}