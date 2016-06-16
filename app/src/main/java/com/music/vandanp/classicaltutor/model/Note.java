package com.music.vandanp.classicaltutor.model;

/**
 * Created by vandanp on 2/4/16.
 */
public class Note {

    private int id ;
    private String name;
    private float startFrequency ;
    private float endFrequency ;

    public Note(int id, String name, float startFrequency, float endFrequency) {
        this.id = id ;
        this.name = name;
        this.startFrequency = startFrequency;
        this.endFrequency = endFrequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStartFrequency() {
        return startFrequency;
    }

    public void setStartFrequency(float startFrequency) {
        this.startFrequency = startFrequency;
    }

    public float getEndFrequency() {
        return endFrequency;
    }

    public void setEndFrequency(float endFrequency) {
        this.endFrequency = endFrequency;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                '}';
    }
}
