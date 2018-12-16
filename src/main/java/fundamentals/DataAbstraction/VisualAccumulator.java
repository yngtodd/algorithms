/******************************************************************************
 *  Compilation:  javac VisualAccumulator.java
 *  Execution:    java VisualAccumulator 
 *  Dependencies: StdDraw 
 *
 *  Accumulates values, plots them, along with the running mean. 
 *  Does not store values, but will keep and running mean. 
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class VisualAccumulator
{
    private double total = 0.0;
    private int N = 0;

    public VisualAccumulator(int trials, double max)
    {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double val)
    {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, mean());
    }

    public double mean()
    { return total / N; }

    public String toString()
    {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }

    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);

        for (int i = 0; i < T; i++)
        {
            a.addDataValue(StdRandom.gaussian());
            StdOut.println(a);
        }
    }
}
