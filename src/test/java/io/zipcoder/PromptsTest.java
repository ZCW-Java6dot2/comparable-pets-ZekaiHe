package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class PromptsTest {
    //Pet pet = new Pet();
    @Before


    @Test
    public  void PromptsCorrectNumPetTest(){
        //given
        Prompts pr = new Prompts();
        Integer userInput = 2;
        //when
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pr.promptUserNumOfPets();
        //Then
        Assert.assertEquals(userInput,pr.getNumOfPets());
    }

    @Test
    public  void PromptsCorrectTypeTest() throws IllegalAccessException, InstantiationException {
        //given
        Prompts pr = new Prompts();

        //when
        String input = "Dog";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pr.promptUserPetType();
        Object obj = pr.getCls().newInstance();

        //Then
        Assert.assertTrue(obj instanceof Dog);
    }

    @Test
    public  void PromptsPetNameTest() {
        //given
        Prompts pr = new Prompts();

        String input = "Dog";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        pr.promptUserPetType();

        //when
        String input2 = "Momo";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);
        pr.promptUserPetName();

        String actualName = pr.getPet().getPetList().get(0).getName();

        //Then
        Assert.assertEquals(input2,actualName);
    }

}
