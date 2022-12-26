package com.example.colloquium1.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImplementation implements FactorialService {

    @Override
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    @Override
    public long[] firstFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        long[] result = new long[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * (i + 1);
        }
        return result;
    }
}
