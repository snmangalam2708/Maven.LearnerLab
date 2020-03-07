package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class People <E extends Person> {

    ArrayList<E> personList = new ArrayList<>();

    public People() {
    }

    public Boolean add(E person) {

        return personList.add(person);
    }

    public E findById(Long id) {

        for (E person : personList) {
            if (person.getId() == id ) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(E person){

        return personList.contains(person);
    }

    public void remove(long id) {

        Integer idx = personList.indexOf(id);
        personList.remove(idx);
    }

    public void remove(E person){

        Integer idx = personList.indexOf(person);
        //System.out.println(idx);
        personList.remove(person);
    }

    public void removeAll() {

        personList.clear();
    }

    public int count() {

        return personList.size();
    }

    public E[] toArray(){

        return (E[]) personList.toArray();
    }

}