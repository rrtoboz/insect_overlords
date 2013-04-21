package com.ricktoboz.omgbugz;

/*
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Moire extends Canvas {

 //   public void paint(Graphics g) {
 //       int i = 90;
 //       while (i < getWidth()) {
 //           g.drawOval (((400 - i)/2), ((400 - i)/2), i, i);
 //           i = i + 10;
 //       }
 //   }

    public void paint(Graphics g){
        System.out.println("Your bounds are: " + g.getClipBounds());
        int i = 0;
        while (i < 400){
            g.drawLine(i, 0, (400 - i), 400);
            g.drawLine(0, i, 400, (400 - i));
            i = i + 10;
        }

    }

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new Moire();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);
    }
}