package com.example.pet.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class PetModelTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createPet() throws Exception {

        PetModel petModel = new PetModel();
        petModel.setBirthdate(new Date());
        petModel.setName("goofy");
        petModel.setSpecies("dodo dog");
        petModel.setVeterinarian("dr Strange");

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(petModel));

    }
}