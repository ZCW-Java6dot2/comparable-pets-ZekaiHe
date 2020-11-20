package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PetTest {
    Pet pet = new Pet();
    Pet dog1 = new Dog();
    Pet dog2 = new Dog();
    Pet cat1 = new Cat();
    Pet goat1 = new Goat();
    @Before
    public void Setup(){
        dog1.setName("Momo");
        dog2.setName("Milo");
        cat1.setName("Momo");
        goat1.setName("Satay");

        pet.addPet(dog1);
        pet.addPet(dog2);
        pet.addPet(cat1);
        pet.addPet(goat1);
    }

    @Test
    public  void ConstructorNullTest(){
        //given
        Pet p = new Pet();
        //Then
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public  void ConstructorNameTest(){
        //given
        String expectedName = "Machina";
        Pet p = new Pet(expectedName);
        //when
        String actualName = p.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public  void setNameTest(){
        //given
        Pet p = new Pet("Machina");
        String expectedName = "Tidus";
        //when
        p.setName(expectedName);
        String actualName = p.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void sortList1Test(){
        ArrayList<Pet> expectedList = new ArrayList<>();
        expectedList.add(dog2);
        expectedList.add(cat1);
        expectedList.add(dog1);
        expectedList.add(goat1);

        ArrayList<Pet> actualList = pet.sortList1(pet.getPetList());

        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void sortList2Test(){
        ArrayList<Pet> expectedList = new ArrayList<>();
        expectedList.add(cat1);
        expectedList.add(dog2);
        expectedList.add(dog1);
        expectedList.add(goat1);

        ArrayList<Pet> actualList = pet.sortList2(pet.getPetList());

        Assert.assertEquals(expectedList,actualList);
    }
}