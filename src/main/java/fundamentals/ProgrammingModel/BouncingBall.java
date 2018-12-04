/*************************************************************************
 *  Compilation:  javac BouncingBall.java
 *  Execution:    java BouncingBall
 *  Dependencies: StdDraw.java
 *
 *  Implementation of a 2-d bouncing ball in the box from (-1, -1) to (1, 1).
 *
 *  % java BouncingBall
 *
 *************************************************************************/

import edu.princeton.cs.algs4.StdDraw;

public class BouncingBall
{
    public static void main(String[] args)
    {
        // Cordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        double rx = 0.480, ry = 0.860; // position
        double vx = 0.015, vy = 0.023; // velocity
        double radius = 0.05;

        while (true)
        {   
            // Hitting the wall changes direction and scrubs some speed.
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -0.9 * vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -0.9 * vy;

            rx = rx + vx;
            ry = ry + vy;

            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            StdDraw.show(20);
        }
    }
}
