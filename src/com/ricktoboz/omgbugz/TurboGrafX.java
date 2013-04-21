package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 3/28/13
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class TurboGrafX extends Canvas {

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new TurboGrafX();
        canvas.setSize(400, 400);
        frame.getContentPane().add(canvas);
        canvas.setBackground(Color.white);

        // show the frame
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g) {
        // draw a circle
        g.setColor(Color.red);
        g.fillOval(92, 100, 216, 200);
    }
}
