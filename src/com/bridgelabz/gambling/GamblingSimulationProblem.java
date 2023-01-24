package com.bridgelabz.gambling;

import java.util.Random;

public class GamblingSimulationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        int stake = 100;
        int playCount = 0;
        int wonCount = 0;
        int lossCount = 0;
        Random random = new Random();
        int day = 0;
        int forDay = 20;
        for (int i= day;i<=forDay;i++){
            playCount++;
            int bet = random.nextInt(3);
            switch (bet){
                case 1:
                    stake = stake + 1;
                    wonCount++;
                    System.out.println("player current money is "+stake);
                    break;
                case 2:
                    stake = stake - 1;
                    lossCount++;
                    System.out.println("player loss bet so current money is "+stake);
                    break;
                default:
                    System.out.println("player stop Gambling for a day");
            }
            System.out.println("current day "+ day++);
        }

        System.out.println("No of times Played:"+playCount);
        System.out.println("No Of Times Won:"+wonCount);
        System.out.println("No Of Times Lost:"+(playCount-wonCount));
     }
}
