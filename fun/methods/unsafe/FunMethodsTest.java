package fun.methods.unsafe;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;

public class FunMethodsTest {
    @Test
    public void testMyName() {
        assertEquals("Harry", FunMethods.sayMastersName());
    }

    @Test
    public void testAddition() {
        assertEquals(4, FunMethods.add(2, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(25, FunMethods.multiply(5, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(25, FunMethods.divide(100, 4));
    }

    @Test
    public void testRemainder() {
        assertEquals(1, FunMethods.getRemainder(10, 3));
    }

    @Test
    public void testQuadratic() {
        assertEquals(14, FunMethods.quadrateForTwo(2, 2, 2));
    }

    @Test
    public void testMotivation() {
        assertEquals("Keep going!", FunMethods.motivate());
    }
}