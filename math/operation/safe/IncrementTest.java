package math.operation.safe;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;

public class IncrementTest {
    @Test
    public void testIncrementZero() {
        assertEquals(1, Increment.increment(0));
    }

    /*
    @Test
    public void testIncrementMaxValue() {
        assertEquals(2147483648, Increment.increment(Integer.MAX_VALUE));
    }
    */
   
    @Test
    public void testtestIncrementTen() {
        assertEquals(11, Increment.increment(10));
    }

    @Test
    public void testIncrementNegative() {
        assertEquals(-3, Increment.increment(-4));
    }

    @Test
    public void testMinusOne() {
        assertEquals(0, Increment.increment(-1));
    }
}