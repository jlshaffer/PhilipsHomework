// PetModel.java
package com.example.pet.model;

import java.util.Date;
import java.util.List;

public class PetModel 
{
	// FYI From Spec:
	//	A family pet tracker, that tracks pet name, pet birthdate, pet species, vets name, and list of
	//	doctor visits (date, reason), 
	
	// Pet Name
	public String getName()
	{
		return strName;
	}
	
	public void setName(String name)
	{
		strName = name;
	}
	
	// Pet Birthdate
	// Question for Paul and Ken. What date type am I using? Why so many?
	public Date getBirthdate()
	{
		return dtBirthdate;
	}
	
	public void setBirthdate(Date birthDate)
	{
		dtBirthdate = birthDate;
	}
	
	// Pet Species. 
	// TODO: Make species a type. 
	public String getSpecies()
	{
		return strSpecies;
	}
	
	public void setSpecies(String species)
	{
		strSpecies = species;
	}
	
	// Veternarian's name.
	// TODO: We need to track vet's separately so we don't have a bunch of misspellings of the same name
	// Choose a vet from a list?
	public String getVeterinarian()
	{
		return strVeterinarian;
	}
	
	public void setVeterinarian(String veterinarian)
	{
		strVeterinarian = veterinarian;
	}
		
	// TODO This needs a lot of work. I'll see how it goes but I need to associate the visits with the pet. 
	public List<VisitModel> getDoctorVisits()
	{
		return listVisit;
	}
		
	// Privates
	private String strName;
	private Date dtBirthdate;
	private String strSpecies;
	private String strVeterinarian;
	private List<VisitModel> listVisit;
	

}