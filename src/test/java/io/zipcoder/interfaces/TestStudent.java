package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student someguy=new Student("Rando", 8);
        Assert.assertTrue(someguy instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student someguy=new Student("Rando", 8);
        Assert.assertTrue(someguy instanceof Person);
    }

    @Test
    public void testLearn(){
        Student someguy=new Student("Rando", 8);
        double expected = 39.6;
        someguy.learn(expected);
        Assert.assertEquals(expected, someguy.getTotalStudyTime(), .0001);

    }
}
/*Create a TestStudent class.
Create a testImplementation method that asserts that a Student is an instanceof a Learner.
Create a testInheritance method that asserts that a Student is an instanceof a Person.
Create a testLearn method that ensures a Student's totalStudyTime instance variable is
incremented by the specified numberOfHours by invoking the .learn method.*/