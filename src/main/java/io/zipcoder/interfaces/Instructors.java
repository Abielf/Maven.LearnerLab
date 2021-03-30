package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People{
    private static final Instructors instance=new Instructors();


    private Instructors(){
        add(new Instructor("Dolio",15));
        add(new Instructor("Chris Nobles", 16));
        add(new Instructor("Kris Younger", 17));
        add(new Instructor("Dan Staub",18));
    }

    public static Instructors getInstance(){return instance;}


}
