package com.bridgelabz.gambling;

import java.util.Random;

public class GamblingSimulationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        int stake = 100;
        int playCount = 0;
        int wonCount = 0;
        Random random = new Random();
        while(stake != 151&& stake!= 49){
            playCount++;

            int num = random.nextInt(2);
        if (num == 1){
            stake = stake + 1;
            wonCount++;
        }else {
            stake = stake -1 ;
            System.out.println("Remaining stack is:"+stake);
        }
      }
      if(stake > 150){
          System.out.println("player win more than its 50 percent of stack");
      }
      else {
          System.out.println("player looses more than its 50 percent of stack");
      }

        System.out.println("No of times Played:"+playCount);
        System.out.println("No Of Times Won:"+wonCount);
        System.out.println("No Of Times Lost:"+(playCount-wonCount));
     }
}
