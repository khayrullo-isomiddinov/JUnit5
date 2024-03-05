package famous.sequence;

// -----> These are mandatory for structural tests <-------- //

//import static check.CheckThat.*;
//import static check.CheckThat.Condition.*;
//import check.*;


/*
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class FibonacciTest {
    @Test
    public void testOne() {
        assertEquals(5, Fibonacci.fib(5));
    }
}