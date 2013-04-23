package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 4/21/13
 * Time: 1:01 PM
 * To change this template use File | Settings | File Templates.
 */

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {

    private int[] danceArray;
    private int whichStepAreWeOn = 0;

    public DancingBug(int[] x) {
        danceArray = x;
    }

    public void act() {
        int turns = 0;
        if ((whichStepAreWeOn + 1) > danceArray.length) {
            whichStepAreWeOn = 0;
            return;
        } else {
            while (turns <= danceArray[whichStepAreWeOn]) {
                turn();
                turns++;
            }
            move();
            whichStepAreWeOn++;
        }
    }
}
