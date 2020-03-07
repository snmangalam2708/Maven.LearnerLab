package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

    @Test
    public void testConstructor() {

        Person person1 = new Person(123L, "Jaby");
        String expectedName = "Jaby";
        Long expectedID  = 123L;

        String actualName  = person1.getName();
        Long actualID = person1.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedID, actualID);

    }

    @Test
    public void testSetName() {

        Person person1 = new Person(123L, "Achara");
        String expectedName = "Achara";
        person1.setName();
        String actualName = person1.getName();

        Assert.assertEquals(expectedName, actualName);

    }

}


