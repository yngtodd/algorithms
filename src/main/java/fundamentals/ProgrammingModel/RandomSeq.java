/******************************************************************************
 *  Compilation:  javac RandomSeq.java
 *  Execution:    java RandomSeq n lo hi
 *  Dependencies: StdOut.java, StdRandom.java
 *
 *  Prints N numbers between lo and hi.
 *
 *  % java RandomSeq 5 100.0 200.0
 *  123.43
 *  153.13
 *  144.38
 *  155.18
 *  104.02
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq
{
    private RandomSeq() { }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        if (args.length == 1)
        {
            for (int i = 0; i < n; i++)
            {
                double x = StdRandom.uniform();
                StdOut.println(x);
            }
        }

        else if (args.length == 3)
        {
            double lo = Double.parseDouble(args[1]);
            double hi = Double.parseDouble(args[2]);

            for (int i = 0; i < n; i++)
            {
                double x = StdRandom.uniform(lo, hi);
                StdOut.printf("%.2f\n", x);
            }
        }

        else { throw new IllegalArgumentException("Invalid number of arguments."); }
    }
}
