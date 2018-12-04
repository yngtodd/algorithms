/******************************************************************************
 *  Compilation:  javac Average.java
 *  Execution:    java Average < data.txt
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a sequence of real numbers, and computes their average.
 *
 *  % java Average
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  [Ctrl-d]
 *  Average is 10.5
 *
 *  Note [Ctrl-d] signifies the end of file on Unix.
 *  On windows use [Ctrl-z].
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average 
{
    public static void main(String[] args)
    {
        int count = 0;
        double sum = 0;

        StdOut.println("Enter a series of numbers, followed by Ctrl-d\n");

        while (!StdIn.isEmpty())
        {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        double average = sum / count;

        StdOut.println("Average is " + average);
    }
}
