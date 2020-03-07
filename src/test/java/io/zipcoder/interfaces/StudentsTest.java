package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void testStudents() {
        Students students = Students.getInstance();
        Integer expected = 6;
        Integer actual = students.count();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

}
