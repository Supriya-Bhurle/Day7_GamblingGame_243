package com.bridgelabz.gambling;

import java.util.Random;

public class GamblingSimulationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        int stake = 100;
        int bet = 1;
        Random random = new Random();
        System.out.println("start with a stake of " + stake +" every day and bet " + bet +" every game.");
        int num = random.nextInt(2);
        if (num == 1){
            System.out.println("Gambler won the bet");
        }else {
            System.out.println("Gambler lost the bet");
    }}
}
