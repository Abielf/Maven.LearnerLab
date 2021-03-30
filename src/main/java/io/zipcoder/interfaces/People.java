package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    protected List<E> personList;


    public People(){
        personList=new ArrayList<E>();
    }

    public void add(E e){personList.add(e);}

    public E findById(long id){
        for(E e:personList){
            if(e.getId()==id){
                return e;
            }
        } return null;
    }

    public  boolean contains(E e){
        for (E i:personList){
            if(i==e){
                return true;
            }
        } return false;
    }

    public void remove(E e){
        personList.remove(e);
    }
    public void remove(long id){
        personList.remove(findById(id));
    }
    public void removeAll(){personList.clear();}
    public int count(){return personList.size();}

    abstract public E[] toArray();

    public Iterator<E> iterator(){return personList.iterator();}

}