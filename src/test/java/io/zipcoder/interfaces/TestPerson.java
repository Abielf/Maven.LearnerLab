package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void TestConstructor(){
        long expected =8675309;
        Person jeff= new Person("Jeff", expected);
        Assert.assertEquals(expected, jeff.getId());
    }
    @Test
    public void TestConstructor2(){
        String expected ="Tommy Pickles";
        Person jeff= new Person(expected, 675309);
        Assert.assertEquals(expected, jeff.getName());
    }

    @Test
    public void TestNameSet(){
        String expected ="Tommy Pickles";
        Person jeff= new Person("jeff", 675309);
        jeff.setName(expected);
        Assert.assertEquals(expected, jeff.getName());
    }

}