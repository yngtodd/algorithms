/******************************************************************************
 *  Compilation:  javac Accumulator.java
 *  Execution:    java Accumulator 
 *  Dependencies: None 
 *
 *  Simple class to accumulate doubles.
 *  Does not store values, but will keep and running mean. 
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;

public class Accumulator
{
    private double total = 0;
    private int N = 0;

    public void addDataValue(double val)
    {
        N++;
        total += val;
    }

    public double mean()
    { return total / N; }

    public String toString()
    {
        return "Mean (" + N + " values): " 
                   + String.format("%7.5f", mean());
    }

    public static void main(String[] args){
        Accumulator accumulator = new Accumulator();

        double[] data = { 1.0, 2.0, 3.0, 4.0 };
        for (int i = 0; i < data.length; i++)
        {
            accumulator.addDataValue(data[i]);
            StdOut.println(accumulator);
        }

        double avg = accumulator.mean();
        StdOut.println(avg);
    }
}
