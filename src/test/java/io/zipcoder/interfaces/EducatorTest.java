package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static io.zipcoder.interfaces.Educator.DOLIO;
import static io.zipcoder.interfaces.Educator.KRIS;
import static org.junit.Assert.*;

public class EducatorTest {
    Educator roberto = Educator.ROBERTO;
    Student s = new Student(11L, "Ujjwal");
    Learner[] learners = new Learner[]{s};

    @Test
    public void testImplementation(){
        Assert.assertTrue(roberto instanceof Teacher);

    }

    @Test
    public void testTeach(){
        double expected = s.getTotalStudyTime()+12;
        roberto.teach(s, 12);
        Assert.assertTrue(expected == s.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        double expected = s.getTotalStudyTime()+8;
        roberto.lecture(learners, 8);
        Assert.assertTrue(expected == s.getTotalStudyTime());
    }
}