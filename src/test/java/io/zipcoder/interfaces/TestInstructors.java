package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    Instructors staff = Instructors.getInstance();


    @Test
    public void testCohortInSingleton1(){
        int expected = 4;
        Assert.assertEquals(expected,staff.count());
    }
}
