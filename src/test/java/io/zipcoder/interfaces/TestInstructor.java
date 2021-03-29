package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor someguy=new Instructor("TeacherMan", 37);
        Assert.assertTrue(someguy instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor someguy=new Instructor("TeacherLady this time", 8);
        Assert.assertTrue(someguy instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor someguy=new Instructor("Batman", 8);
        Student someoneElse=new Student("Robin", 00000);
        double expected=96.3;
        someguy.teach(someoneElse,expected);
        Assert.assertEquals(expected, someoneElse.getTotalStudyTime(), .0001);
    }

    @Test
    public void testLecture(){
        Instructor someguy=new Instructor("Batman", 8);
        Student someoneElse=new Student("Dick Greyson", 00000);
        Student another=new Student("Jason Todd", 00001);
        Student anotherOne=new Student("Damien Wayne", 00001);
        Learner[] robins={someoneElse, another, anotherOne};
        double totalHours=1.5;
        double expected=totalHours/3;
        someguy.lecture(robins, totalHours);
        Assert.assertEquals(expected,another.getTotalStudyTime(),.0001);
    }
}