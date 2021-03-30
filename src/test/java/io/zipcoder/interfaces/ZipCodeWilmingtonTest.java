package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington Z = ZipCodeWilmington.getInstance();
    Instructor d=new Instructor("Jeff",19);


    @Test
    public void testHostLecture(){
        Double totalHours=0.0;
        boolean itsTrue=true;
    Z.hostLecture(d,28.0);
    }
}
/*Create a TestZipCodeWilmington class.
Create a testHostLecture method which ensures that each of the Student's
totalStudyTime instance variable is incremented by the specified numberOfHours
upon invoking the hostLecture method.*/