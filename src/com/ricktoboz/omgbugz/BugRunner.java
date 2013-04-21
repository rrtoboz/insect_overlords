package com.ricktoboz.omgbugz;/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import com.ricktoboz.omgbugz.BoxBug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.awt.Color;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import com.ricktoboz.omgbugz.CircleBug;


/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug(6);
        alice.setColor(Color.ORANGE);
        CircleBug bob = new CircleBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();

    }

    public static void movebug(Bug b) {
    Boolean a = b.canMove();
    if (a == true) {
    b.move();
        }
}
    public static void randomBug (Bug b, int n){
    Double c = (StrictMath.random() + StrictMath.random());
    if (c <= 0.5) {movebug(b);}
        else if (c<= 1.0) {b.turn(); b.turn(); movebug(b);}
            else if (c <= 1.5) {b.turn(); b.turn(); b.turn(); b.turn(); movebug(b);}
                else {b.turn(); b.turn(); b.turn(); b.turn(); b.turn(); b.turn(); movebug(b);}
    if (n == 0) {} else {randomBug(b, (n - 1));
    }
}
    public static void colorBug (Bug b, Color c){
    int d = b.getLocation().getCol();
    int e = b.getLocation().getRow();
    System.out.println("cyanBug's location is (" + d + ", " + e + ").");
    b.setColor(c);
    }

    public static void makeBugs (ActorWorld a, int n){
    if (n == 0) {} else {
    Bug b = new Bug();
    a.add(b);
        int d = b.getLocation().getCol();
        int e = b.getLocation().getRow();
    Color c = new Color(d, 0, e);
    b.setColor(c);
    makeBugs (a, (n - 1));

    }
}}