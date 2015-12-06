package com.hex.harshilfacts;

import java.util.Random;

/**
 * Created by Harshil on 7/12/2015.
 */
public class FactBook {
    //Member Variables
    String[] mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Cats have a non-fatal terminal velocity. They can survive a fall from any height.",
            "The human body is composed primarily of water.",
            "Tomatos are technically considered fruits.",
            "The gravity of a blackhole is so strong even photons(light) cannot escape",
            "Some bamboo plants can grow almost a meter in just one day.",
            "Some penguins can leap 2-3 meters or 6-9 feet out of the water.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "On average it takes 66 days to form a new habit.",
            "Olympic gold medals are primarily made of silver.",
    };

    public String getFact() {
        //Randomly select a fact.
        Random randomGenerator = new Random();  //New Random generator
        int randomNumber = randomGenerator.nextInt(mfacts.length);

        return mfacts[randomNumber];
    }
}
