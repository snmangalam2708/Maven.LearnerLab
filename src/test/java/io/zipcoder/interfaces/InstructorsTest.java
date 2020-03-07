package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class InstructorsTest {

    @Test
    public void getInstanceTest() {

        Instructors ins = Instructors.getInstance();
        Integer expected = 4;
        Integer actual = ins.count();
        Assert.assertEquals(expected, actual);

    }
}