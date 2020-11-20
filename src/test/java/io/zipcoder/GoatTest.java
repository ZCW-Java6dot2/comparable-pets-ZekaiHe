package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class GoatTest {
    @Test
    public  void ConstructorTest(){
        //given
        String expectedName = "Billy";
        Goat g = new Goat(expectedName);
        //when
        String actualName = g.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }
}