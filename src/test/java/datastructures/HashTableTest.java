package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {

    private HashTable hashTable;

    @Before
    public void setUp() {
        hashTable = new HashTable();
    }

    @Test
    public void PutAndGet() {
        hashTable.put("Kim", "1111");
        hashTable.put("Na", "2222");
        hashTable.put("Park", "3333");
        hashTable.put("Lee", "4444");

        Assert.assertEquals("1111", hashTable.get("Kim"));
        Assert.assertEquals("2222", hashTable.get("Na"));
        Assert.assertEquals("3333", hashTable.get("Park"));
        Assert.assertEquals("4444", hashTable.get("Lee"));
        Assert.assertEquals(null, hashTable.get("Choi"));
    }

    @Test
    public void Empty() {
        Assert.assertEquals(null, hashTable.get("Lee"));
        Assert.assertEquals(null, hashTable.get("Choi"));
    }
}
