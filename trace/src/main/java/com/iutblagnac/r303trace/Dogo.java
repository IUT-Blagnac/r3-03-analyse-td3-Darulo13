package com.iutblagnac.r303trace;

public class Dogo {
    private String name;
    private int age;

    public Dogo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void naissance() {
        System.out.println(App.hello("Le dogo est né."));
    }

    public void mort() {
        System.out.println("Le dogo est mort.");
    }
}
