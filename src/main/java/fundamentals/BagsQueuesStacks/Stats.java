/*************************************************************************
 *  Compilation:  javac Stats.java
 *  Execution:    java Stats < input.txt
 *  Dependencies: Bag.java StdIn.java StdOut.java
 *
 *  Reads in a sequence of real numbers from standard input and 
 *  computes their mean and standard deviation.
 * 
 *  % java Stats
 *  100 99 101 120 98 107 109 81 101 90
 *  Mean:    100.60
 *  Std dev: 10.51
 *  
 *************************************************************************/

import edu.princeton.cs.algs4.StdIn;

public class Stats
{
    public static void main(String[] args)
    {
        Bag<Double> numbers = new Bag<Double>();

        while (!StdIn.isEmpty())
            numbers.add(StdIn.readDouble());

        int N = numbers.size();
        for (double x : numbers)
            sum += x;

        double mean = sum/N;

        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean) * (x - mean);

        double std = Math.sqrt(sum/(N-1));

        StdOut.printf("Mean: %2.f\n" mean);
        StdOut.printf("Std dev: %2.f\n", std);
    }
}
