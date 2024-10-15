package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void pushTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3,stack.peek());
    }

    @Test
    public void popTest() {
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.pop();
        stack.push(10);
        stack.push(70);
        stack.pop();

        Assert.assertEquals(10,stack.peek());
    }
}
