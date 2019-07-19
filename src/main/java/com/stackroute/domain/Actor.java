package com.stackroute.domain;

import org.springframework.stereotype.Component;

//@Component
public class Actor {
    
    //Properties of actor class
    private String name;
    private String gender;
    private int age;

    public Actor() {
    //default constructor
    }

    public Actor(String name, String gender, int age) {//Parameterised constructor
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {//Setter for name field
        this.name = name;
    }

    public void setGender(String gender) {//Setter for name gender
        this.gender = gender;
    }

    public void setAge(int age) {//Setter for name age
        this.age = age;
    }

    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
