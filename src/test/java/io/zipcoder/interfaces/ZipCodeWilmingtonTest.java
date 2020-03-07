package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    Instructor chris = new Instructor(30L, "chris");
    ZipCodeWilmington zip = new ZipCodeWilmington();

    @Test
    public void testHostLecture1() {
        zip.hostLecture(chris,1);
    }
}