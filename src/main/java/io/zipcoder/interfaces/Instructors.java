package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor>{
    private static final Instructors instance=new Instructors();


    private Instructors(){
        super();
        add(Educator.DOLIO.getI());
        add(Educator.NOBLES.getI());
        add(Educator.YOUNGER.getI());
        add(Educator.STABB.getI());
    }

    public static Instructors getInstance(){return instance;}

    public Instructor[] toArray(){
        Instructor[] staffRoom= new Instructor[count()];
        for (int i=0;i< personList.size();i++) {
            staffRoom[i] = personList.get(i);
        }
        return staffRoom;
    }

}
