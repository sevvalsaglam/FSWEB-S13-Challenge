package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        System.out.println(healthplan);
    }
}