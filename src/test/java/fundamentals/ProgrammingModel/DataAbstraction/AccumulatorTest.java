import org.junit.Test;
import static org.junit.Assert.*;
import edu.princeton.cs.algs4.StdOut;

public class AccumulatorTest
{
    @Test public void Accumulator()
    {
        Accumulator accumulator = new Accumulator();

        double[] data = { 1.0, 2.0, 3.0, 4.0 };
        for (int i = 0; i < data.length; i++)
        {
            accumulator.addDataValue(data[i]);
        }

        assert accumulator.mean() == 2.5;
    }
}
