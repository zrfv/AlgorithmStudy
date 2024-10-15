package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    private Queue queue;

    @Before
    public void SetUp() {
        queue = new Queue();
    }

    @Test
    public void Add() {
        queue.put(15);
        queue.put(7);
        queue.put(3);

        Assert.assertEquals(15, queue.peek());
    }

    @Test
    public void Remove() {
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.get();
        queue.put(4);
        queue.put(5);
        queue.get();

        Assert.assertEquals(3, queue.peek());
    }
}

