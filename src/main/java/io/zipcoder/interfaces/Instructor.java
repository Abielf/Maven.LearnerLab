package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    Instructor(String n, long i) {
        super(n, i);
    }
    public void teach(Learner learner, double numberOfHours){ learner.learn(numberOfHours);}

    public void lecture(Learner[] learners, double numberOfHours){
        double numberOfHoursPerLearner=numberOfHours/ learners.length;
        for(Learner l:learners){l.learn(numberOfHoursPerLearner);}
    }
}
