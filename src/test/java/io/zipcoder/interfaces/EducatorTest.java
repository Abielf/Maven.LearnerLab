package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void testImplementation(){
        Educator bigTeach= Educator.DOLIO;
        Assert.assertTrue(bigTeach instanceof Teacher);
    }

    @Test
    public void testInhritance(){
        Instructor bigTeach= Educator.YOUNGER.getI();
        Assert.assertTrue(bigTeach instanceof Instructor);
    }
    @Test
    public void testInhritance2(){
        Instructor bigTeach= Educator.YOUNGER.getI();
        Assert.assertTrue(bigTeach instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor someguy=Educator.NOBLES.getI();
        Student someoneElse=new Student("Robin", 00000);
        double expected=33.6;
        someguy.teach(someoneElse,expected);
        Assert.assertEquals(expected, someoneElse.getTotalStudyTime(), .0001);

    }
    @Test
    public void testLecture(){
        Instructor someguy=Educator.STABB.getI();
        Student someoneElse=new Student("Dick Greyson", 00000);
        Student another=new Student("Jason Todd", 00001);
        Student anotherOne=new Student("Damien Wayne", 00001);
        Learner[] robins={someoneElse, another, anotherOne};
        double totalHours=11.7;
        double expected=totalHours/3;
        someguy.lecture(robins, totalHours);
        Assert.assertEquals(expected,another.getTotalStudyTime(),.0001);
    }
}
/*Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
student's totalStudyTime instance variable is incremented by the specified numberOfHours.

Create a testLecture method that ensures when an Instructor invokes the lecture method, a
respective array of students' totalStudyTime instance variables is incremented by
numberOfHours/students.length.*/