package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double studyTime=0;

    Student(String n, long i) {
        super(n, i);
    }

    public void learn(double numberOfHours){studyTime+=numberOfHours;}
    public Double getTotalStudyTime(){return studyTime;}
}