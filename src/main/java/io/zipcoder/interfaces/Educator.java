package io.zipcoder.interfaces;

public enum Educator implements Teacher{
DOLIO(new Instructor("Dolio Durant",15)),NOBLES(new Instructor("Dolio Durant",16)),
    YOUNGER(new Instructor("Dolio Durant",17)), STABB(new Instructor("Dolio Durant",18));

private final Instructor i;
private Double timeWorked;

Educator(Instructor i){
    this.i=i;
}
public Instructor getI(){return this.i;}

    public void teach(Learner learner, double numberOfHours) {
    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }
}