package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){

        Student student1 = new Student(123L, "Jaby");
        Assert.assertTrue(student1 instanceof Learner);
    }

    @Test
    public void testInheritance(){

        Student student1 = new Student(123L, "Jaby");
        Assert.assertTrue(student1 instanceof Person);
    }

    @Test
    public void testLearn() {

        Student student1 = new Student(123L, "Jaby");
        Double expected = 20.0;
        student1.learn(20);
        Double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

}