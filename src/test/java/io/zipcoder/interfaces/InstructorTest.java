package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {

        Instructor instructor2 = new Instructor(123L, "Jaby");
        Assert.assertTrue(instructor2 instanceof Teacher);
    }

    @Test
    public void testInheritance() {

        Instructor instructor3 = new Instructor(123L, "Jaby");
        Assert.assertTrue(instructor3 instanceof Person);
    }

    @Test
    public void testTeach() {

        Instructor instructor1 = new Instructor(111L, "Achara");
        Learner learner1 = new Student(123L, "Jaby");
        instructor1.teach(learner1, 40);
        Double expected = 40.0;
        Double actual = learner1.getTotalStudyTime();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture() {

        Instructor instructor1 = new Instructor(111L, "Achara");
        Student student1 = new Student(123L, "Jaby");
        Student student2 = new Student(456L, "Marshall");
        Student student3 = new Student(789L, "Jerry");


        Learner[] learnerActual = new Learner[3];
        learnerActual[0] = student1;
        learnerActual[1] = student2;
        learnerActual[2] = student3;

        learnerActual[0].learn(20);
        learnerActual[1].learn(30);
        learnerActual[2].learn(25);

        Double actual1 = 20.0 + 21.0/3.0 ;
        Double actual2 = 30.0 + 21.0/3.0 ;
        Double actual3 = 25.0 + 21.0/3.0 ;


        instructor1.lecture(learnerActual, 21);

        Learner[] learnerExpected = new Learner[3];
        learnerExpected[0] = student1;
        learnerExpected[1] = student2;
        learnerExpected[2] = student3;

        Double expected1 = learnerExpected[0].getTotalStudyTime();
        Double expected2 = learnerExpected[1].getTotalStudyTime();
        Double expected3 = learnerExpected[2].getTotalStudyTime();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);

    }
}