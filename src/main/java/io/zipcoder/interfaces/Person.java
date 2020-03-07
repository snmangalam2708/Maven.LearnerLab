package io.zipcoder.interfaces;

public class Person {

    private final Long id;
    private String name;

    public Person(Long id, String name){

        this.id = id;
        this.name = name;
    }

    public Long getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public void setName(){

        this.name = name;
    }
}
