package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington Z = ZipCodeWilmington.getInstance();




    @Test
    public void testHostLecture() {
    Z.hostLecture(15, 42.0);
    Double expected=3.0;
    Map<String, Double> mappy=Z.getStudyMap();
    Double actual= mappy.get("Abiel Figueroa");
    Assert.assertEquals(expected,actual,.0001);
    }
}
/*Create a TestZipCodeWilmington class.
Create a testHostLecture method which ensures that each of the Student's
totalStudyTime instance variable is incremented by the specified numberOfHours
upon invoking the hostLecture method.*/