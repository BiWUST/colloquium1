package com.example.colloquium1;

import com.example.colloquium1.service.FactorialService;
import com.example.colloquium1.service.FactorialServiceImplementation;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class FactorialServiceTests {
    @Rule
    public FactorialService factorialService = new FactorialServiceImplementation();

    @Test
    public void testFactorial() {
        assert factorialService.factorial(5) == 120;
    }

    @Test
    public void testFactorial2() {
        assert factorialService.factorial(0) == 1;
    }

    @Test
    public void testFactorial3() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorialService.factorial(-1);
        });
    }

    @Test
    public void testFirstFactorials() {
        long[] result = factorialService.firstFactorials(5);
        assert result[0] == 1;
        assert result[1] == 2;
        assert result[2] == 6;
        assert result[3] == 24;
        assert result[4] == 120;
    }

    @Test
    public void testFirstFactorials2() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorialService.firstFactorials(0);
        });
    }
}
