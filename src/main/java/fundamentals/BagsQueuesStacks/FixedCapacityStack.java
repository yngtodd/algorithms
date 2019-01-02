/*************************************************************************
 *  Compilation:  javac FixedCapacityStack.java
 *  Execution:    java FixedCapacityStack
 *  
 *  Generic stack implementation with a fixed-size array.
 *
 *  % more tobe.txt 
 *  to be or not to - be - - that - - - is 
 * 
 *  % java FixedCapacityStack 5 < tobe.txt 
 *  to be not that or be
 *
 *  Remark:  bare-bones implementation. Does not do repeated
 *  doubling or null out empty array entries to avoid loitering.
 *
 *************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack
{
    private String[] a;
    private int N;

    public FixedCapacityStack(int cap)
    {
        a = new String[cap];
    }

    public boolean isEmpty() { return N == 0; }
    public int size()        { return N; }

    public void push(String item)
    {
        a[N++] = item;
    }

    public String pop()
    {
        return a[--N];
    }
}
