package famous.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import check.*;

public class TriangularNumbersTest {
    @Test
    public void checkWhatValueIsZero() {
        assertEquals(0, TriangularNumbers.getTriangularNumber(0));
    }

    @Test
    public void checkWhatValueIsOne() {
        assertEquals(1, TriangularNumbers.getTriangularNumber(1));
    }

    @Test
    public void checkSpecialGauss() {
        assertEquals(5050, TriangularNumbers.getTriangularNumber(100));
    }

    
    @Test
    public void checkNegative() {
        assertEquals(-1, TriangularNumbers.getTriangularNumber(12253725));
    }

    @Test
    public void checkSpecialGaussAlternative() {
        assertEquals(5050, TriangularNumbers.getTriangularNumberAlternative(100));
    }
}