package com.ricktoboz.omgbugz;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;


public class Mickey extends Canvas {

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb) {
        if (bb.width < 3) {
            return;
        }

        boxOval(g, bb);

        int dx = bb.width / 2;
        int dy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

        half.translate((-half.width / 2), (-half.width / 2));
        boxOval(g, half);
        mickey(g, half);

        half.translate((half.width * 2), 0);
        boxOval(g, half);
        mickey(g, half);


        //half.setBounds(half.x, half.y, (half.width/2), (half.height/2));
        //half.translate((-half.width/2), (-half.width/2));
        //mickey (g, half);
        //half.translate((half.width*2), 0);
        //mickey (g, half);

    }

    public void paint(Graphics g) {
        Rectangle bb = new Rectangle(100, 150, 200, 200);
        g.setColor(Color.gray);
        mickey(g, bb);
    }

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new Mickey();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);
    }
}