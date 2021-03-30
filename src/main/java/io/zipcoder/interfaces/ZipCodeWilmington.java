package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington instance=new ZipCodeWilmington();
    Students cohort=Students.getInstance();
    Instructors staff=Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(cohort.toArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher=staff.findById(id);
        teacher.lecture(cohort.toArray(),numberOfHours);
    }

    public Map<String, Double> getStudyMap(){
        Student[] temp=cohort.toArray();
        Map<String,Double> map=new HashMap<String, Double>();
        for(int i=0;i< temp.length;i++){
            map.put(temp[i].getName(),temp[i].getTotalStudyTime());
        }
        return map;
    }

    public static ZipCodeWilmington getInstance(){return instance;}

}