package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
        Dogo dogo = new Dogo("Rex", 3);
        dogo.naissance();
        System.out.println("Le dogo s'appelle " + dogo.getName() + " et a " + dogo.getAge() + " ans.");
        dogo.bark();
        dogo.mort();
    }

    public static String hello() {
        return "Hello World!";
    }

    public static String hello(String param) {
        return param;
    }

}
