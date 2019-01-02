import org.junit.Test;
import static org.junit.Assert.*;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackTest
{
    @Test public void FixedCapacityStack()
    {
        FixedCapacityStack s = new FixedCapacityStack(6);

        String[] shakespeare = { "To", "be", "or", "not", "to", "be"};
        for (String item : shakespeare)
            s.push(item);

        while (!s.isEmpty())
        {
            StdOut.print(s.pop() + " ");
            StdOut.println("(" + s.size() + " left on stack.)");
        }
    }
}
