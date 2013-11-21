package com.Amit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by qlogy on 11/21/13.
 */
public class MyFirstProgram {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = "Instructor";
        System.out.println("Give your name");
        try {
            name = in.readLine();
        } catch (IOException e) {
            System.out.println("caught in exception");

        }
        System.out.println("Hello " + name + "!");

    }
}
