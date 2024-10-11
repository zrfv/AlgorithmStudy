package algorithms;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void testFib() {
        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(0, fibonacci.fib(0));
        Assert.assertEquals(1, fibonacci.fib(1));
        Assert.assertEquals(1, fibonacci.fib(2));
        Assert.assertEquals(2, fibonacci.fib(3));
        Assert.assertEquals(3, fibonacci.fib(4));
        Assert.assertEquals(5, fibonacci.fib(5));
        Assert.assertEquals(8, fibonacci.fib(6));
        Assert.assertEquals(13, fibonacci.fib(7));

    }
}
