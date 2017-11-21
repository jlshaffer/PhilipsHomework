// ServicePet.java
package com.example.pet.service;

import com.example.pet.model.PetModel;

// JLS - In a perfect world this would be call IPetService. 
// Since Java does everything ass-backwards we just assume the file is an interface. 
// https://www.javatpoint.com/java-naming-conventions
// interface name	should start with uppercase letter and be an adjective e.g. Runnable, Remote, ActionListener etc.
public interface ServicePet {

	public String savePet(PetModel pet);

	public boolean isPetExist(PetModel pet);
	
	PetModel findByName(String name);
}
