package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 4/20/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */

import info.gridworld.actor.Bug;

public class BoxBug extends Bug {

    private int steps;
    private int sideLength;

    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            turn();
            steps = 0;
        }
    }
}