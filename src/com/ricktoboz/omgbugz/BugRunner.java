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
public class BugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        int[] anArray = {1, 2, 3, 4, 5, 6};
        DancingBug alice = new DancingBug(anArray);
        DancingBug apple = new DancingBug(anArray);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.add(apple);
        world.show();

    }

}