package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Actor {

    //Actor Attributes
    private String name;
    private String gender;
    private int age;

    public Actor() {//default constructor for Actor class

    }

    public Actor(String name, String gender, int age) {//parameterised constructor for Actor class
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {//setter for name
        this.name = name;
    }

    public void setGender(String gender) {//setter for gender
        this.gender = gender;
    }

    public void setAge(int age) {//setter for age
        this.age = age;
    }

    public void printActor()
    {
        //Printing Actor description
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
