package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestStudents {

    Students cohort = Students.getInstance();



    @Test
    public void testCohortInSingleton1(){
        String expected="Lena Litouka";
        String Actual=cohort.findById(2).getName();

    }

    @Test
    public void testCohortInSingleton2(){
        cohort.findById(2).learn(5.6);
        Double expected=5.6;
        Double actual = cohort.findById(2).getTotalStudyTime();
        Assert.assertEquals(expected,actual,.001);
    }



}

/*Create a test method which ensures that each of the
students in your current cohort are in your Students singleton.*/