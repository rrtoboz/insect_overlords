package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 4/20/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */

import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
    private int steps;
    private int sideLength;
    private int sides;

    public CircleBug(int length) {
        steps = 0;
        sideLength = length;
        sides = 0;
        setDirection(90);
    }

    public void act() {
        if (sides == 3) {
            return;
        }
        if (steps < sideLength && canMove() == false) {
            return;
        } else if (steps < sideLength) {
            move();
            steps++;
        } else if (sides == 0) {
            turn();
            turn();
            turn();
            sides++;
            steps = 0;
            return;
        } else if (sides == 1) {
            turn();
            turn();
            turn();
            turn();
            turn();
            sides++;
            steps = 0;
            return;
        } else if (sides == 2) {
            sides++;
            return;
        }
    }
}


