package com.example.opsc_poe;

public class ProgressBarView
{
    // the resource ID for the imageView
    private String pGoalDescription;

    // TextView 1
    private int ptxtGoalLimit;

    // TextView 1


    // create constructor to set the values for all the parameters of the each single view
    public ProgressBarView(String GoalDescription, int txtGoalLimit)
    {
        pGoalDescription = GoalDescription;
        ptxtGoalLimit = txtGoalLimit;
    }

    // getter method for returning the ID of the imageview
    public String getNumbersImageId() {
        return pGoalDescription;
    }

    // getter method for returning the ID of the TextView 1
    public int getNumberInDigit() {
        return ptxtGoalLimit;
    }


}
