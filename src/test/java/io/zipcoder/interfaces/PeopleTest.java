package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class PeopleTest {

    @Test
    public void addTest() {

        ArrayList<Person> al = new ArrayList<>();
        Person person1 = new Person(123L, "Jaby");
        Person person2 = new Person(456L, "Marshall");
        Person person3 = new Person(789L, "Jerry");

        al.add(0, person1);
        al.add(1, person2);
        al.add(2, person3);

        Assert.assertTrue(al.contains(person1));
        Assert.assertTrue(al.contains(person2));
        Assert.assertTrue(al.contains(person3));
    }

    @Test
    public void findByIDTest() {



//        ArrayList<Person> al = new ArrayList<>();
//        Person person1 = new Person(123L, "Jaby");
//        Person person2 = new Person(456L, "Marshall");
//        Person person3 = new Person(789L, "Jerry");
//
//        al.add(0, person1);
//        al.add(1, person2);
//        al.add(2, person3);
//
////        System.out.println(person1.getName());
////        System.out.println(person1.getId());
//
//        People  p = new People();
////        People  p2 = new People();
////        People  p3 = new People();
//
//        p.personList.add(al);
////        p.personList.add(person2);
////        p.personList.add(person3);
//
//
//
//
//        Person expected = person1;
//        Person actual =  p.findById(123L);
//
//        Assert.assertEquals(expected, actual);

    }



    @Test
    public void removeByPersonTest() {

        ArrayList<Person> al = new ArrayList<>();
        Person person1 = new Person(111L, "Barney");
        Person person2 = new Person(222L, "Ted");
        Person person3 = new Person(333L, "Lily");

        al.add(0, person1);
        al.add(1, person2);
        al.add(2, person3);

        al.remove(person1);

        Assert.assertFalse(al.contains(person1));

    }

}