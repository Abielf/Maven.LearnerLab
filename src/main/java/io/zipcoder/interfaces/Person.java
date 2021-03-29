package io.zipcoder.interfaces;

public class Person {
    String name;
    final long id;

    Person(String n, long i){
        name=n;
        id=i;
    }

    public long getId(){return id;}
    public String getName(){return name;}

    public void setName(String newName){name=newName;}
}