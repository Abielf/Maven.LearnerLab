package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    Students cohort = Students.getInstance();



    @Test
    public void testCohortInSingleton1(){
        String expected="Lena Litouka";
        String Actual=cohort.findById(2).getName();

    }



}

/*Create a test method which ensures that each of the
students in your current cohort are in your Students singleton.*/