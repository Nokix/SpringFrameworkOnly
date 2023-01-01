package de.reichert.aop;

import org.springframework.stereotype.Component;

@Component
public class Binomial {

    @Cached
    public int nOverK(int n, int k) {
        if (n == 0 || k == n) return 1;
        return nOverK(n - 1, k) + nOverK(n - 1, k - 1);
    }
}
