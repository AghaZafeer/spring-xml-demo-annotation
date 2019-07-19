package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//This annotation will create an object of movie class
public class Movie {
    private Actor actor;

    public Movie() {// default constructor for Movie class
    }

    @Autowired
    public Movie(Actor actor) {//Parameterised constructor for Movie class
        this.actor = actor;
    }

    public void setActor(Actor actor2) {
        this.actor = actor2;
    }

    public void printAboutMovieActor()
    {
        actor.printActor();//Printing Actor description
    }
}
