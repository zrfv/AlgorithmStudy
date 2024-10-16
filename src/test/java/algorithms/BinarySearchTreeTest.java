package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    private  BinarySearchTree tree;

    @Before
    public void setUp() {
        tree = new BinarySearchTree();
    }

    @Test
    public void insertTree() {
        tree.insert(5, "a");
        tree.insert(3, "b");
        tree.insert(6, "c");
        tree.insert(1, "d");
        tree.insert(2, "e");
        tree.insert(8, "f");
        tree.insert(7, "g");

        Assert.assertEquals("a", tree.get(5));
        Assert.assertEquals("b", tree.get(3));
        Assert.assertEquals("c", tree.get(6));
        Assert.assertEquals("d", tree.get(1));
        Assert.assertEquals("e", tree.get(2));
        Assert.assertEquals("f", tree.get(8));
        Assert.assertEquals("g", tree.get(7));
        Assert.assertNull(tree.get(99));
        tree.prettyPrint();
    }

    @Test
    public void deleteTree() {
        tree.insert(5, "a");
        tree.insert(3, "b");
        tree.insert(6, "c");
        tree.insert(1, "d");
        tree.insert(2, "e");
        tree.insert(8, "f");
        tree.insert(7, "g");

        tree.delete(3);
        tree.delete(6);
        tree.delete(5);
        Assert.assertNull(tree.get(3));
        Assert.assertEquals(1, tree.root.left.key);
        Assert.assertEquals(7, tree.root.key);
        tree.prettyPrint();
    }
}
