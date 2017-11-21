// PetEntity.java
package com.example.pet.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pets")
public class PetEntity 
{	
	public PetEntity() {}
	 
    public PetEntity(String name, Date birthDate) 
    {
        this.name = name;
        this.birthDate = birthDate;
    
        // TODO - JLS - The rest of the entity after I 
        // figure out how to save this thing to disc. 
    }
 
    // Properties -- TODO - JLS - What is the region equivalent? 
    public String getId()
    {
    	return id;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public Date getBirthDate()
    {
    	return birthDate;
    }
    
    // TODO - JLS - What the heck do I do with the visits. 
    // Map them together?
 
    // privates -- What are the naming conventions on entities?
    @Id
    private String id;
    private String name;
    private Date birthDate;
}
