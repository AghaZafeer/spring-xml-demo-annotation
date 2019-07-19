package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actor;

    public Movie(Actor actor) {//Constructor for Movie class
        this.actor = actor;
    }

    public void setActor(Actor actor) {//Setter for Actor object
        this.actor = actor;
    }

    public void printAboutMovieActor()
    {
        actor.printActor();//Printing about actor
    }
}
