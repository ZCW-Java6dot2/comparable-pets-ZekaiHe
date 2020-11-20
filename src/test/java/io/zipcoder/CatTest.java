package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public  void ConstructorTest(){
        //given
        String expectedName = "Pussinboots";
        Cat c = new Cat(expectedName);
        //when
        String actualName = c.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }
}
