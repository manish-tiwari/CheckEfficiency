package junit.practice.Test;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Manish on 7/12/2017.
 */
public class TestPrintMessage {

    @Test
    public void testHello()  {
        String hello="Hello World";
        assertEquals("Hello World",hello);

    }

    @Ignore("This message indicates that this test is being ignored by test runner")
    @Test
    public void testAssertFalse() {
        assertFalse(true);
    }
}