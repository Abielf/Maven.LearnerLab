package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students extends People<Student>{
    private static final Students instance=new Students();




    private Students(){
        add(new Student("Abiel Figueroa", 1));
        add(new Student("Lena Litouka", 2));
        add(new Student("Xiong Yuan", 3));
        add(new Student("Monali Khandelwal", 4));
        add(new Student("Theresa Mashura", 5));
        add(new Student("Justin Banks", 6));
        add(new Student("Chris Allen", 7));
        add(new Student("Ashlet Smart", 8));
        add(new Student("Kelly Porter", 9));
        add(new Student("Jorge Tapia", 10));
        add(new Student("Gerg Donnelly", 11));
        add(new Student("Xiong Yuan", 12));
        add(new Student("Mike Ninh", 13));
        add(new Student("Hazel Becker", 14));
    }
    public static Students getInstance() {
        return instance;
    }

    public Student[] toArray(){
        Student[] classRoom= new Student[count()];
        int i=0;
        Iterator IT=iterator();
        while (IT.hasNext()){
            classRoom[i]=(Student)IT.next();
        }
        return classRoom;
        }

}