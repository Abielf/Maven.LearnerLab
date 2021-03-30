package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class TestPeople {

    People group=new People();
    Person p1=new Person("Jeff",001);
    Person p2=new Person("Moe", 100);
    Person p3=new Person("Larry", 010);
    Person p4=new Person("Curly", 110);


    @Test
    public void testAdd(){
        group.add(p1);
        group.add(p2);
        Iterator tester = group.iterator();
        int expected=2;
        int actual=0;
        while(tester.hasNext()){
            actual++;
            tester.next();
        }
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemove(){
        group.add(p1);
        group.add(p2);
        group.add(p3);
        group.add(p4);
        group.remove(110);
        group.remove(100);
        Iterator tester = group.iterator();
        int expected=2;
        int actual=0;
        while(tester.hasNext()){
            actual++;
            tester.next();
        }
        Assert.assertEquals(expected, actual);
    }


   @Test
   public void testRemoveById(){
       group.add(p1);
       group.add(p2);
       group.add(p3);
       group.add(p4);
       group.remove(p3);
       Iterator tester = group.iterator();
       int expected=3;
       int actual=0;
       while(tester.hasNext()){
           actual++;
           tester.next();
       }
       Assert.assertEquals(expected, actual);
   }

    @Test
    public void testFindById(){
        group.add(p1);
        group.add(p2);
        group.add(p3);
        group.add(p4);
        Assert.assertEquals(p2,group.findById(100) );
    }

}