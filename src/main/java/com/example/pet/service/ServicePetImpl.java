// ServicePetImpl.java
package com.example.pet.service;

import org.springframework.stereotype.Service;

import com.example.pet.entity.PetEntity;
import com.example.pet.model.PetModel;
import com.example.pet.repository.PetRepository;

@Service("petService")
public class ServicePetImpl implements ServicePet
{
	public ServicePetImpl(PetRepository repository)
	{
		this.repository = repository;
	}
		
	@Override
	public String savePet(PetModel pet) 
	{
		// Do we want the domain layer to know about our BO? Or just send primitive types?
		PetEntity petEntity = new PetEntity(pet.getName(), pet.getBirthdate());
		
		// WHat the heck am I returning?
		return repository.save(petEntity).getId();
	}

	@Override
	public boolean isPetExist(PetModel pet)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PetModel findByName(String name)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	// Privates
	private PetRepository repository;
	
}
